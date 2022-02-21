import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        
        Game g = new Game();

        g.play();
        
    }
    
}

class Player{

    // Attributes
    String nickname;
    String selection;
    // int winStack;
    // double exp;
    // int level;

    // Constructor


    // Behaviour
    public static Player newPlayer() {

        Scanner input = new Scanner(System.in);
        Player newPlayer = new Player();

        System.out.print("Enter your nickname : ");
        newPlayer.nickname = input.nextLine();
        input.close();
        return newPlayer;
        
    }
    public void gameSelection() {
        Scanner input = new Scanner(System.in);
        String outputStr = 
                           "Rock     : 1"+
                           "\nScissors : 2"+
                           "\nPaper    : 3";
        System.out.println(outputStr);
        System.out.print("Select what you want : ");
        this.selection = input.nextLine();
        input.close();
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


