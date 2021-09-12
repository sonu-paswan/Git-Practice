import java.util.Scanner;
import java.lang.Math;
public class Prime_num {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any positive number ");
        int num=input.nextInt();
        int flag=1;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag=0;
                break;
            }

        }
        if(flag==0)
        System.out.println(num+" is not prime number");
        else if(num<2)
        System.out.println("enter number greater than 1");
        else
        System.out.println(num+" is prime number");
        input.close();
    }
}
