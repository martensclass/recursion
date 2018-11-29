
public class FactNum {

  
    public static void main(String[] args) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        System.out.println(fact1(50));
        time2 = System.currentTimeMillis() - time1;
        System.out.println("Recursive Time: " + time2);
        time1 = System.currentTimeMillis();
        System.out.println(fact2(50));
         time2 = System.currentTimeMillis() - time1;
         System.out.println("Non-recursive Time: " + time2);
    }
    
    public static long fact1(int num){
        if(num==1) return num;
        else
            return num * fact1(num-1);
    }
    
    public static long fact2(int num){
        int answer=1;
        for(int x=1; x<=num; x++)
            answer = answer * x;
        return answer;
    }
    
    
}
