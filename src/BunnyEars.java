import java.util.ArrayList;

public class BunnyEars {

    ArrayList<Integer> testdata;  //data being sent int
    ArrayList<Integer> expected;  //expected result
    String id;

    BunnyEars(ArrayList<Integer> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }

    //the actual method that solves the problem
    public int solve(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + solve(bunnies - 1);
        }
    }

    //testing the method with test data and comparing the results
    public void test(){
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("===================================");
        for(int x = 0; x<testdata.size(); x++){
            String output = id + "(" + testdata.get(x) + ")->" + expected.get(x);
            System.out.print(String.format("%-25s",output)); //puts question into 25 even spaces
            int result = solve(testdata.get(x));
            String status = result==expected.get(x)? "OK":"FAIL";
            System.out.println(result + "\t" + status);
        }
    }
    
    public static void main(String args[]){
        ArrayList<Integer> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        //add test data
        in.add(0); in.add(1); in.add(2);
        in.add(3); in.add(4); in.add(5);  
        in.add(12); in.add(50); in.add(234);
        //add expected results
        out.add(0); out.add(2); out.add(4);
        out.add(6); out.add(8); out.add(10);  
        out.add(24); out.add(100); out.add(468);
        //create problem
        BunnyEars prob = new BunnyEars(in,out,"BunnyEars");
        //run the test
        prob.test();
    }  
}
