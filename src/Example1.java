
public class Example1 {

    public static void main(String[] args) {
        // TODO code application logic here
        recurs(10);
        int x = badRecurs(8);
    }
    
    public static void recurs(int num){
        System.out.println("This is call " + num);
        if (num==1)
            System.out.println("I am done calling");
        else{
            System.out.println("Waiting for call " + (num-1) + " to finish");
            recurs(num-1);
        }
        System.out.println("Call " + num + " is now done.");
    }
    
    public static int badRecurs(int num){
        if(num == 10) return num;
        else{ 
         num--;
         //   System.out.println("Calling badRecurs with value " + num);
         return badRecurs(num);
        }
    }
    
   
}
