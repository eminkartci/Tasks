import java.util.Scanner;
public class BA {

    public static void main(String[] args) {
      // Customer p1 = new Customer(11234,"Bora" , "Simsek",70);
        
      //p1.show_customer();
      Customer p2 = new Customer(231684312, "Emin", "Kartci",123456,60,20);
        p2.withdraw_money(10);
        p2.take_credit(25);
        p2.show_customer();
        
    }

    
}

class Customer {

    //Atributes
    private int ID;
    String Name, Surname;
    int BirthYear;
    Scanner input = new Scanner(System.in);
    private long TCKN;
    private double Balance;
    double Debt;
    //Constructor
    
    public Customer(int ID, String Name, String Surname,long TCKN, double Balance,double debt){
        this.ID = ID;
        this.Name = Name;
        this.Surname = Surname;
        this.Balance = Balance;
        this.Debt = debt;
        this.TCKN = TCKN;

        


    }

    //Behaviours

    public double upload_money(double amount){
        this.Balance = this.Balance + amount;
        return this.Balance;

    }
    public double withdraw_money(double amount){
        if (this.Balance< amount) {
            System.out.println("You don't have enough balance to withdraw.");
            return this.Balance;
            
        }
        this.Balance = this.Balance - amount;
        return this.Balance;

    }

    public void show_customer(){
        System.out.println("------------------------------------------------");
        System.out.print("Customer ID is : "+ this.ID);
        System.out.print("\nCustomer name is : "+ this.Name);
        System.out.print("\nCustomer TCKN is : "+ this.TCKN );
        System.out.print("\nCustomer "+this.ID+ " balance is : "+this.Balance);
        System.out.println("\nCustomer debt is : "+this.Debt);
        System.out.println("------------------------------------------------");
    }
    public double take_credit(double amount){
        this.Balance = this.Balance +amount;
        this.Debt = -amount;
        return this.Balance;


    }


}