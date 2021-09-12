package java_games;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner input=new Scanner(System.in);
        System.out.println("guess number between 0 to 9");
        int myNum,comNum;
        do{
            System.out.println("enter your number ");
            myNum=input.nextInt();
            comNum=ran.nextInt(10);
            System.out.println("computer number is "+comNum);
            System.out.println("your number is "+myNum);
        }while(myNum!=comNum);
        System.out.println("you win");
        input.close();
    }
    
    
}
