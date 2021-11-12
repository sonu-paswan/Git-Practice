package BANK;
import java.util.Scanner;
class Bank{
    Bank(){};
    long accountNumber;
    String IFSC;
    String BankServices;
}
class AccountHolder extends Bank{ //account holder class 
    
    String name;
    String Address;
    long contact;
    
    double balance;
    String Occupation;
    

    AccountHolder(long accountNumber, String IFSC, String name) { // constructor
        // super();
        this.accountNumber = accountNumber;
        this.IFSC = IFSC;
        this.name = name;
    }

    public void EnterMoredetail(String address, long cont, double b, String O, String Services) {
        this.balance = b;
        this.Address = address;
        contact = cont;
        this.Occupation = O;
        this.BankServices = Services;

    }

    public double CheckLoan() {
        if ((balance >= 50000.0 && balance <= 100000.0) && (!Occupation.equals("farmer"))&&(!BankServices.equals("locker")))
            return (double) 8.0;
        else if ((balance >= 500000.0) && (!BankServices.equals("locker"))&& (!Occupation.equals("farmer"))) 
            return (double) 7.00;
        else if ((balance >= 500000.0) && (BankServices.equals("locker")) && (!Occupation.equals("farmer")))
            return (double) 6.50;
        else {
            return (double) 6.00;
        }
    }
    public void display(){
        System.out.println(this.accountNumber+" "+this.IFSC+" "+this.name+" "+this.Address+" "+this.Occupation+" "+this.balance+" "+this.Occupation+" "+this.BankServices);
    }
}

class Main { //main class
    public static void main(String args[]) {
        long Ac,contact;
        double balance;
        Scanner input=new Scanner(System.in);
        System.out.println("enter account number");
        Ac=input.nextLong();
        input.nextLine();
        String Name,IF,Address,Ocup,Locker;
        System.out.println("enter IFSC");
        IF=input.nextLine();
        System.out.println("enter name");
        Name=input.nextLine();
        System.out.println("enter address");
        Address=input.nextLine();
        System.out.println("enter contact");
        contact=input.nextLong();
        input.nextLine();
        System.out.println("enter balance");
        balance=input.nextDouble();
        input.nextLine();
        System.out.println("enter occuption and locker system");
        Ocup=input.nextLine();
        Locker=input.nextLine();
        AccountHolder obj1 = new AccountHolder(Ac,IF, Name);
        obj1.EnterMoredetail(Address,contact, balance, Ocup, Locker);

        double loan = obj1.CheckLoan();
        System.out.println(loan);
        // obj1.display();
        input.close();
    }

}
