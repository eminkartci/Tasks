
### Task 2
```
Title: Simulate the Game "Rock(🪨), Paper(📰), Scissors(️️✂️)"

1. Get Player's Nicknames:

   Create a function that asks for nicknames 
   and returns these values to the main method.

2. Take the inputs
   
   Create a function which takes the selections as integers

   The function takes the input of both players 

      * 1 -> (Rock(🪨)
      * 2 -> Paper(📰)
      * 3 -> Scissors(️️✂️))

   Return the selections to the main method

3. Decide Winner
   
   Create a function that tooks the players and selections.
   Return the winner player's nickname

   The rules of Rock(🪨), Paper(📰), Scissors(️️✂️), if not known:

     Both players have to say either 
     "Rock(🪨)", "Paper(📰)" or "Scissors(️️✂️)" at the same time.

  -> Rock(🪨)     beats   Scissors(️️✂️)
  -> Paper(📰)    beats   Rock(🪨)
  -> Scissors(️️✂️)  beats   Paper(📰)

4. Announce the Winner

   Take the output of the method written in third step.
   Announce the winner in a fancy way !

5. Create a Fork on GitHub

6. Clone the repository

7. Add your code & changes

8. Push to the GitHub & Create a pull request

```
### Sample Case
```
===============> Welcome to Rock Paper Scissors Game <===============

Author      : Durmuş Kartci & Emin Kartci
Date        : 05/02/2021
GitHub      : eminkartci
-----------------------------------------------------------------

Player 1 Nickname: <Take Input> (eminK)
Player 2 Nickname: <Take Input> (durmusK)

-----------------------||Game is Starting||-----------------------

Player 1 Turn: <Take Input> (Paper)
Player 2 Turn: <Take Input> (Rock)

---------------------------!! WINNER !!---------------------------

"eminK" is the winner !!

```
---
### Thanks
```
Author      : Durmuş Kartci & Emin Kartci
Date        : 05/02/2021
Difficulty  : Easy
Website     : eminkartci.com
```
my code:

 package to_do_list;
 import java.util.Scanner;
 public class second_task {
	
	public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
		System.out.println("===============> Welcome to Rock Paper Scissors Game <===============");
		
		//take nicknames of both players
		String player_1 =  Get_nickname(console);
		String player_2=  Get_nickname(console);
		System.out.println("Player 1 Nickname: " + player_1);
		System.out.println("Player 2 Nickname: " + player_2);
		
		System.out.println("-----------------------||Game is Starting||-----------------------");
		
		// take decisions of each player as an integer 1,2,3 = rock, paper, scissors
		String selection_1 = Take_inputs(console);
		String selection_2 = Take_inputs(console);
		System.out.println("Player 1 Turn: " + selection_1);
		System.out.println("Player 2 Turn: " + selection_2);
		
		System.out.println("---------------------------!! WINNER !!---------------------------");
		
		//assigning the winner
		System.out.println(Decide_winner(player_1, player_2, selection_1, selection_2) + " is the winner !");
	}
	
	public static String Get_nickname(Scanner console) {
		//take nicknames of both players
				String nickname = console.next();
				return nickname;
	}
	public static String Take_inputs(Scanner console) {
		       int input = console.nextInt();
		       String decision= ""; 
		       if(input == 1) {
		    	   decision = "Rock(🪨)";
		       
		       }else if(input == 2) {
		    	   decision = "Paper(📰)";
		       
		       }else if(input == 3) {
		    	   decision = "Scissors(️️✂️)";
		    } 
		       return decision;
	}

	public static String Decide_winner(String player_1, String player_2, String selection_1, String selection_2) {
	
		String winner = null;
		if(selection_1 == "Rock(🪨)" && selection_2 == "Scissors(️️✂️)") {
			winner =  player_1;
		
		} else if(selection_1 == "Paper(📰) " && selection_2 == "Rock(🪨)") {
			winner =  player_1;
		
		} else if (selection_1 == "Scissors(️️✂️)" && selection_2 == "Paper(📰)") {
			winner =  player_1;
		
		} else {
			winner = player_2;
		}
		return winner;
	}
}
