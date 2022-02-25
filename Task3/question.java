// Bora Şimşek 24/02/22
// GitHub: 
// @2022 All Rights Reserved


import java.util.Scanner;
public class question {
    public static void main(String[] args) {
         
        bank_operations xyz = new bank_operations();
        xyz.init();
        xyz.Selection();

    }


}

/* All question
Title: Bank Account

1. Create a "Customer" class

    Properties
    ------------------------
    a. ID
    b. Name
    c. Surname
    d. Birth Year
    e. TCKN
    f. Balance

    Constructor
    ------------------------

    Behaviours
    ------------------------
    a. upload_money
    b. withdraw_money
    c. take_credit
    d. show_customer
    e. save_customer
    

2. Behaviour Explanations
   
   a -> customer can upload money to his/her balance
   b -> customer can withdraw money but s/he cannot withdraw greater than his/her account.
   c -> they can take credit
   d -> when you call this function the output should look like:
   
   ----------------> CUSTOMER {ID} <----------------
   Name         : ---
   Surname      : ---
   Birth Year   : ---
   TCKN         : ---
   Balance      : ---

   e -> when you call this function the data of the customer will be saved as txt file

3. Write a driver program

    a. Create a customer
    b. Get Name Surname ...
    c. Show the customer
    d. Deposit 100 tl
    e. Show the customer
    f. Withdraw 40 tl
    g. Show the customer
    h. Withdraw 170 tl
    i. Take 100 tl credit
    j. Show the customer
*/

class Customer {

    /*Properties
    ------------------------
    a. ID
    b. Name
    c. Surname
    d. Birth Year
    e. TCKN
    f. Balance
*/
    String name, surname;
    Integer Id, BirthYear, TCKN;
    
    public static Scanner input = new Scanner(System.in);
    /*Constructor
    ------------------------
*/


    //Behaviours
    public static Customer newCustomer() {
        Customer newCustomer = new Customer();
        System.out.print("Enter your name : ");
        newCustomer.name = input.nextLine();
        System.out.print("Enter your surname : ");
        newCustomer.surname = input.nextLine();
        System.out.print("Enter your birth year : ");
        newCustomer.BirthYear = input.nextInt();
        System.out.print("Enter your first 4 digit of TCKN : ");
        newCustomer.TCKN = input.nextInt();

        String outputString = "Hi "+ newCustomer.name +" "+ newCustomer.surname +"\n"+
                              "Welcome to Bora Bank";
        //aklıma bilgileri teyit etme fonksiyonu geldi, if ile doğru mu yanlış mı diye kullanıcıya son bir kez daha sor.
        System.out.println(outputString);

        return newCustomer;
    }

}

class bank_operations {
    //Properties
    Double Balance, money;
    Customer p1;
    double InitialMoney = 0;
    /*Constructor
    ------------------------
*/


    /*Behaviours 
    ------------------------
    a. upload_money
    b. withdraw_money
    c. take_credit
    d. show_customer
    e. save_customer
*/
    public void init() {
        this.p1 = Customer.newCustomer();

    }
    public void Selection() {
        String OutputStr = "a. upload_money"+"\n"+
                           "b. withdraw_money"+"\n"+
                           "c. take_credit"+"\n"+
                           "d. show_customer"+"\n"+
                           "e. save_customer";
        System.out.println(OutputStr);

        System.out.println("Select what you want : ");
        Scanner selection = new Scanner(System.in);
        String userChoice = selection.next();
        if (userChoice.equalsIgnoreCase("a")) {
            bank_operations.upload_money();
            
        }
        else if (userChoice.equals("b")) {
            bank_operations.withdraw_money();
        }
        else if (userChoice.equals("c")) {
            bank_operations.take_credit();
        }
        else if (userChoice.equals("d")) {
            bank_operations.show_customer();
        }
        else if (userChoice.equals("e")) {
            bank_operations.save_customer();
        }

        selection.close();
    }
   
    public static void upload_money() {
        
        //User chose option a

        //Get the money input from user

        //add the money if s/he have before

        //Show the resultant balance
    }
    
    public static void withdraw_money() {
               
    }
    
    public static void take_credit() {
               
    }
    
    public static void show_customer() {
               
    }

    public static void save_customer() {
               
    }

}





