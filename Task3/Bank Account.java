import java.util.*;
import java.io.*;


public class BankAccount {
	public static void main(String[] args) throws IOException {
		
		//Starting Part
		System.out.println("===============> Welcome to Metin Bank <===============");
		System.out.println("Author      : Metin Arda Köker\r\n" + "Date        : 14/02/2021\r\n"
				+ "GitHub      : MetinArda\r\n" + "-----------------------------------------------------------------");
		
		//Taking inputs from user to define variables
		Scanner cons = new Scanner(System.in);
		System.out.print("ID: ");
		String ID = cons.nextLine();
		System.out.print("Name: ");
		String name = cons.nextLine();
		System.out.print("Surname: ");
		String surname = cons.nextLine();
		System.out.print("TCKN: ");
		String TCKN = cons.nextLine();
		System.out.print("Birth Year: ");
		int birthYear = cons.nextInt();
		
		cons.close();
		// Initializing the customer object
		Customer cust = new Customer(ID,name,surname,birthYear,TCKN);
		/*
		System.out.println(cust.getName());
		System.out.println(cust.getSurname());
		System.out.println(cust.getBirthYear());
		System.out.println(cust.getTCKN());
		System.out.println(cust.getBalance());
		 */
		// Use the functions for the need
		cust.show_customer();
		cust.upload_money(100);
		cust.show_customer();
		cust.withdraw_money(40);
		cust.show_customer();
		cust.withdraw_money(170);
		cust.take_credit(100);
		cust.show_customer();
		
		
		cust.save_customer();

	}

}
