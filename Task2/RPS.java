import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        Game g = new Game();

        g.play();

    

}

class Player{

    // Attributes
    String nickname;
    String selection;
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
                           "Rock     : 1"+
                           "\nScissors : 2"+
                           "\nPaper    : 3";

        System.out.println(outputStr);

        System.out.print("Select what you want : ");

        this.selection = this.input.nextLine();
        

    }
    
}

class Game{

    // Attrbıutes
    Player p1;
    Player p2;

    // Constructor
    public Game(){
        this.p1 = Player.newPlayer();
        this.p2 = Player.newPlayer();
    }

    // Behaviour
    public void play(){
        p1.gameSelection();
        p2.gameSelection();
    }

    public void winner(){

    }



    }
}