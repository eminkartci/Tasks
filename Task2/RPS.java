import java.util.Scanner;

import javax.swing.DefaultRowSorter;

public class RPS {

    public static void main(String[] args) {

        Game g = new Game();
        g.init();
        g.play();
        g.winner();

    }

    

}

class Player{

    // Attributes
    String nickname;
    Integer selection;
    // int winStack;
    // double exp;
    // int level;
    public static Scanner input = new Scanner(System.in);

    // Constructor


    // Behaviour
    public static Player newPlayer() {

        Player newPlayer = new Player();

        System.out.print("Enter your nickname : ");
        newPlayer.nickname = input.nextLine();
        
        return newPlayer;

    }

    public void gameSelection() {
        
        String outputStr = 
                           "Rock       : 1"+
                           "\nPaper    : 2"+
                           "\nScissors : 3";

        System.out.println(outputStr);

        System.out.print("Select what you want : ");
        Scanner selection = new Scanner(System.in);
        this.selection = selection.nextInt();
        

    }
    
}

class Game{

    // Attrbıutes
    Player p1;
    Player p2;
    Player winner;

    // Constructor 

    // Behaviour
    public void init(){
        this.p1 = Player.newPlayer();
        this.p2 = Player.newPlayer();
    }

    public void play(){
        p1.gameSelection();
        p2.gameSelection();
    }

    public void winner(){
        
        // IF P1: Rock P2: Paper
        if(p1.selection == 1 && p2.selection == 2){
            this.winner = p2;
            System.out.println(this.winner);
        }
        else if (p1.selection == 2 && p2.selection == 1){
            this.winner = p1;
            System.out.println(this.winner);
        }
        else if (p1.selection == 1 && p2.selection == 3){
            this.winner = p1;
            System.out.println(this.winner);
        }
        else if (p1.selection == 3 && p2.selection == 1){
            this.winner = p2;
            System.out.println(this.winner);
        }
        else if (p1.selection == 1 && p2.selection == 1){
            System.out.println("Draw ! ");
        }
        else if (p1.selection == 2 && p2.selection == 2){
            System.out.println("Draw ! ");
        }
        else if (p1.selection == 3 && p2.selection == 3){
            System.out.println("Draw ! ");
        }
    }

}