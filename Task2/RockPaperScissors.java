import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("===============> Welcome to Rock Paper Scissors Game <===============\r\n" + "\r\n"
				+ "Author      : Durmuş Kartci & Emin Kartci\r\n" + "Date        : 05/02/2021\r\n"
				+ "GitHub      : eminkartci\r\n" + "-----------------------------------------------------------------");
		Scanner console = new Scanner(System.in);
		System.out.print("Player 1 Nickname: ");
		String player1 = console.nextLine();
		System.out.print("Player 2 Nickname: ");
		String player2 = console.nextLine();
		System.out.println("-----------------------||Game is Starting||-----------------------");
		System.out.println("Options: Rock Paper Scissors");
		System.out.print(player1 + "'s Turn: ");
		String choice1 = console.nextLine();
		System.out.print(player2 + "'s Turn: ");
		String choice2 = console.nextLine();
		result(player1, choice1, player2, choice2);
		console.close();
	}

	public static void result(String player1, String c1, String player2, String c2) {
		c1 = c1.toLowerCase();
		c2 = c2.toLowerCase();
		if (c1.equals(c2)) {
			System.out.println("Both players choose: " + c1);
		} else if (c1.equals("rock") && c2.equals("scissors")) {
			System.out.println("\"" + player1 + "\" is the winner !!");
		} else if (c2.equals("rock") && c1.equals("scissors")) {
			System.out.println("\"" + player2 + "\" is the winner !!");
		} else if (c1.equals("paper") && c2.equals("rock")) {
			System.out.println("\"" + player1 + "\" is the winner !!");
		} else if (c2.equals("paper") && c1.equals("rock")) {
			System.out.println("\"" + player2 + "\" is the winner !!");
		} else if (c1.equals("scissors") && c2.equals("paper")) {
			System.out.println("\"" + player1 + "\" is the winner !!");
		} else if (c2.equals("scissors") && c1.equals("paper")) {
			System.out.println("\"" + player2 + "\" is the winner !!");
		}

	}

}
