package BANK;
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
    

    AccountHolder(long x, String IFSC, String name) { // constructor
        this.accountNumber = x;
        this.name = name;
        this.IFSC = IFSC;
    }

    public void EnterMoredetail(String address, long cont, double b, String O, String Services) {
        this.balance = b;
        this.Address = address;
        contact = cont;
        this.Occupation = O;
        this.BankServices = Services;

    }

    public double CheckLoan() {
        if (balance >= 50000 && balance <= 100000 && Occupation != "farmer" && BankServices != "locker")
            return (double) 8.0;
        else if (balance >= 500000 && BankServices != "locker" && Occupation != "farmer") {
            return (double) 7.00;
        } else if (balance >= 500000 && BankServices == "locker" && Occupation != "farmer") {
            return (double) 6.50;
        } else {
            return (double) 6.00;
        }
    }
}

class Main { //main class
    public static void main(String args[]) {
        AccountHolder Sunny = new AccountHolder(33423123, "IBIBO902", "Sunny");
        Sunny.EnterMoredetail("kandivali,Mumbai", 235579534, 55000, "teacher", "no locker");
        AccountHolder Ramu = new AccountHolder(235546, "BARBONA123", "Ramu");
        Ramu.EnterMoredetail("Nallasopara,Mumbai", 998343536, 2000000, "Engineer", "locker");

        double loan = Sunny.CheckLoan();
        System.out.println(loan);

        double x = Ramu.CheckLoan();
        System.out.println(x);
    }

}
