import java.io.*;

public class Customer {
	private String ID;
	private String name;
	private String surname;
	private int birthYear;
	private String TCKN;
	private double balance;

	//Defining a constructor (balance is 0)
	public Customer(String iD, String name, String surname, int birthYear, String TCKN) {
		this.ID = iD;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.TCKN = TCKN;
		this.balance = 0;
	}

	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String getTCKN() {
		return TCKN;
	}

	public double getBalance() {
		return balance;
	}
	//Depositing money into your bank account
	public void upload_money(double variable) {
		if (variable > 0)
			this.balance += variable;
		else
			System.out.println("Please enter a positive number");

	}
	//Withdrawing money from your bank account
	public void withdraw_money(double variable) {
		if (variable < 0) {
			System.out.println("Please enter a positive number \n");
		} else if (variable > this.balance) {
			System.out.println("Your withdraw can't be higher than your actual balance");
			System.out.println("Your actual balance is: " + this.balance + "\n");
		} else {
			this.balance -= variable;
		}

	}
	//Taking credit from the bank
	public void take_credit(double credit) {

		this.balance += credit;

	}
	//Prints the values of customer
	public void show_customer() {
		System.out.println("----------------> CUSTOMER " + this.ID + " <----------------");
		System.out.println("Name         : " + this.name);
		System.out.println("Surname      : " + this.surname);
		System.out.println("Birth Year   : " + this.birthYear);
		System.out.println("TCKN         : " + this.TCKN);
		System.out.println("Balance      : " + this.balance);
		System.out.println();

	}
	//Saves the customer data to a txt doc
	public void save_customer() throws IOException {
		File file = new File("Customerinfo.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Name         : " + this.name + "\n");
		bw.write("Surname      : " + this.surname + "\n");
		bw.write("Birth Year   : " + this.birthYear + "\n");
		bw.write("TCKN         : " + this.TCKN + "\n");
		bw.write("Balance      : " + this.balance + "\n");

		bw.flush();
		bw.close();
	}

}
