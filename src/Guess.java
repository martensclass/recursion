import java.util.Random;
public class Guess {
    
    static Random r = new Random();
    
    public static void main(String[] args) {
        int mynum = r.nextInt(100) + 1;
        System.out.println("Number to guess: " + mynum);
        int tries = guessMyNumber(0, mynum);
        System.out.println("It took " + tries + " tries to guess the number.");
        
    }
    
    public static int guessMyNumber(int tries, int num){
        int myguess = r.nextInt(100) + 1;
        tries++;
        System.out.println("On try " + tries + " I guessed a " + myguess);
        if(myguess==num)
            return tries;
        else return guessMyNumber(tries,num);
    }
    
}
