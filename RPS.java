import java.util.Scanner;


class RPS{

    public static void main (String[] args){

        
        
        System.out.println("=========> Welcome to Rock Paper Scissors Game <=========");
        System.out.println("Author: Emin Kartci");
        System.out.println("Date  : 10 Feb");
        System.out.println("GitHub: eminkartci");

        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        System.out.println("Player 1 Nickname: ");
        String nickname1 = scanString.nextLine();
        System.out.println("Player 2 Nickname: ");
        String nickname2 = scanString.nextLine();

        int move1 = get_move(nickname1,scanInt);
        int move2 = get_move(nickname2,scanInt);

        decide_winner(nickname1, nickname2, move1, move2);

        System.out.println("All Rights are reserved @2021");

    }


    public static int get_move(String nick,Scanner scan) {

        System.out.println();
        System.out.println(nick + "'s move!! \n1 -> Rock\n2 -> Paper\n1 -> Scissors");
        int move = scan.nextInt();

        return move;
    }

    public static void decide_winner(String nick1 , String nick2 , int move1 , int move2){

        String winner = "";
        String result = "";

        // If the moves are the same it is a tie
        if (move1 == move2) {
            result = "Tie";

        // If the different
        }else{
            // Player 1 is Rock
            if (move1 == 1) {
                // Player 2 is Paper
                if (move2 == 2) {
                    winner = nick2;
                // Player 3 is Scissors
                }else if (move2 == 3){
                    winner = nick1;
                }

            }
            // Player 1 is Paper
            else if (move1 == 2) {
                // Player 2 is Rock
                if (move2 == 1) {
                    winner = nick1;
                // Player 2 is Scissors
                }else if (move2 == 3){
                    winner = nick2;
                }

            }
            // Player 1 is Scissors
            else if (move1 == 3) {

                // Player 2 is Rock
                if (move2 == 1) {
                    winner = nick2;
                // Player 2 is Paper
                }else if (move2 == 2){
                    winner = nick1;
                }

            }

        }


        print_results(winner,result);


    }

    public static void print_results(String winner , String result) {

        if(result.equals("Tie")){
            System.out.println("It is a Tie !!");
        }else {

            System.out.println("Winner is "+winner);
            System.out.println("Congratulations !!");

        }
            
    }

}
