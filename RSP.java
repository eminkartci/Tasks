
// IMPORT THE CLASS
import java.util.Scanner;


class RSP {

    /*

    Author : Emin Kartci
    Date   : 9 Feb 2021
    GitHub : eminkartci

    */

    public static void main(String[] args) {

        // Title of the game
        System.out.println("Rock(🪨), Paper(📰), Scissors(️️✂️)");

        // Create a scanner object
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        // Get the nicknames
        System.out.println("First Player's nickname: ");    String player1Nickname = scanString.nextLine();
        System.out.println("Second Player's nickname: ");   String player2Nickname = scanString.nextLine();

        // Get player's move
        int player1Move = get_move(player1Nickname, scanInt);
        int player2Move = get_move(player2Nickname, scanInt); 

        // Initialize the result
        String result;
        String winner = null;

        // Decide the winner
        if (player1Move == player2Move){
            result = "Tie";
        }else{
            // compare the results
            result = "There is a winner !!";
            // If player 1 selects Rock
            if (player1Move == 1){

                // If player 2 selects Paper
                if(player2Move == 2){
                    // Then player 2 wins
                    winner = player2Nickname;
                // If player 2 selects Scissors
                }else if(player2Move == 3){
                    // Then player 1 wins
                    winner = player1Nickname;

                }

            }

            // If player 1 selects Paper
            else if (player1Move == 2){

                // If player 2 selects Rock
                if(player2Move == 1){
                    // Then player 1 wins
                    winner = player1Nickname;
                // If player 2 selecter Scissors
                }else if(player2Move == 3){
                    // Then player 2 wins
                    winner = player2Nickname;

                }

            }

            // If player 1 selects Scissors
            else if (player1Move == 3){

                // If player 2 selects Rock
                if(player2Move == 1){
                    // Then player 2 wins
                    winner = player2Nickname;
                // If player 2 selecter Paper
                }else if(player2Move == 2){
                    // Then player 1 wins
                    winner = player1Nickname;

                }

            }


        }

        // Print the results
        System.out.println("--------------------> RESULT <-------------------");
        if(result.equals("Tie")){
            System.out.println(result+"\nThere is no winner :(");
        }else {
            System.out.println("The winner is "+ winner);
        }
    }



    public static int get_move(String playerNick,Scanner scanInt){

        System.out.println(playerNick + " select a move: \n1 -> Rock\n2 -> Paper\n3 -> Scissors");
        int move = scanInt.nextInt();

        return move;

    }

}