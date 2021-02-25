import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Message {
	private int ID;
	private String sender;
	private String reciver;
	private String message;
	private String privateMessage;
	private int secretKey;

	// Constructor
	public Message(String sender) {
		this.sender = sender;
	}

	// get Methods
	public String getSender() {
		return sender;
	}

	public String getReciver() {
		return reciver;
	}

	public String getMessage() {
		return message;
	}

	public int getID() {
		return ID;
	}

	public int getSecretKey() {
		return secretKey;
	}

	public String getPrivateMessage() {
		return privateMessage;
	}

	// set methods
	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// Creates a secret key between 0-10
	public void create_SecretKey() {
		Random rand = new Random();
		this.secretKey = rand.nextInt(10) + 1;
	}

	// Creates a encrypted message
	public void encrypt_message() {
		this.privateMessage = "";
		for (int i = 0; i < this.message.length(); i++) {
			char mes = this.message.charAt(i);
			this.privateMessage += (char) (mes + this.secretKey);
		}
	}

	// Saves the message a Message.txt file
	public void save_message() throws IOException {

		File file = new File("Message.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("----------> MESSAGE <----------\n");
		bw.write("ID      : " + getID());
		bw.write("\nFrom	: " + getSender());
		bw.write("\nTo      : " + getReciver());
		bw.write("\nKey     : " + getSecretKey());
		bw.write("\nMessage:\n\t" + getMessage());
		bw.write("Private Message :" + "\n\t" + getPrivateMessage());

		bw.flush();
		bw.close();
	}

}
