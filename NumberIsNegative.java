import java.util.Scanner;
public class NumberIsNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        float num=input.nextFloat();
        if(num<0)
        System.out.println(num+" is negative number");
        else if(num==0)
        System.out.println(num+" is both negative and positive");
        else
        System.out.println(num+" is positive");
        input.close();
    }
}
