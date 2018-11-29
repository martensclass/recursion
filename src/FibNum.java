
import java.util.Calendar;


public class FibNum {


    public static void main(String[] args) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        int x = fib(44);
        time2 = System.currentTimeMillis() - time1;
        System.out.println("Fib 44 = " + x);
        System.out.println("Time took: " + time2 + " ms");
        
        time1 = System.currentTimeMillis();
        x = fib2(44);
        time2 = System.currentTimeMillis() - time1;
        System.out.println("Fib 44 = " + x);
        System.out.println("Time took: " + time2 + " ms");
    }
    
    
    public static int fib(int num){
        if (num==1 || num==2) return 1;
        else
            return fib(num-1) + fib(num-2);
    }
    
    public static int fib2(int num){
        if (num==1 || num==2) return 1;
        int n1=1, n2=1, fib=0;
        for(int x=3; x<=num; x++){
            fib = n1 + n2;
            n1=n2;
            n2=fib;
        }
        return fib;
    }
    
    
   
    
}
