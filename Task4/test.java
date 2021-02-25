import java.util.*;
import java.io.*;

public class Task4 {
	public static void main(String[] args) throws IOException {
		Scanner cons = new Scanner(System.in);

		// Define the sender
		System.out.print("From: ");
		String sender = cons.nextLine();
		Message message = new Message(sender);

		// Define the receiver
		System.out.print("To: ");
		String receiver = cons.nextLine();
		message.setReciver(receiver);

		// Define the message
		System.out.print("Message: ");
		String Message = cons.nextLine();
		message.setMessage(Message);

		// Create message
		message.create_SecretKey();
		message.encrypt_message();

		message.save_message();

		System.out.println("----------> MESSAGE <----------");
		System.out.println("ID      : " + message.getID());
		System.out.println("From	: " + message.getSender());
		System.out.println("To      : " + message.getReciver());
		System.out.println("Key     : " + message.getSecretKey());
		System.out.println("\nMessage:\n\t" + message.getMessage());
		System.out.println("Private Message :" + "\n\t" + message.getPrivateMessage());

	}

}
