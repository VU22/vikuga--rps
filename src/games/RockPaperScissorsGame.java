package games;

import java.util.Scanner;

public class RockPaperScissorsGame {

    Player player;

    Fist aIFist;

    RockPaperScissorsGame(String playerName, int playerScore){
    player = new Player ("Viktoria",0);
    aIFist =new Fist();
    }
    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("Viktoria",0);
        game.playGame();
    }
    void playGame(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice: Rock, Paper, Scissors");
    String choice = scanner.nextLine();
    String stringresult="";
    int inresult = aIFist.play();

    if (inresult==Fist.ROCK){
        stringresult="Rock";
    }
    if (inresult==Fist.PAPER){
        stringresult="Paper";
    }
    if (inresult==Fist.SCISSORS){
        stringresult="Scissors";
    }

    if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("ROCK")){
        System.out.println("Rock against Rock - Tie");
    } if (choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("PAPER")){
        System.out.println("Paper against Paper - Tie");
    } if (choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("SCISSORS")){
        System.out.println("Scissors against Scissors - Tie");
    } if (choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("PAPER")){
        System.out.println("You lose. AI win. Paper wins against Rock");
    } if (choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("SCISSORS")){
        System.out.println("You lose. AI win. Scissors win against Paper ");
    } if (choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("ROCK")){
        System.out.println("You lose. AI win. Rock win against Scissors");
    } if (choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("SCISSORS")){
        System.out.println("You win. AI lose. Rock wins against Scissors");
    } if (choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("PAPER")){
        System.out.println("You win. AI lose. Scissors win against Paper");
    } if (choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("ROCK")){
        System.out.println("You win. AI lose. Paper wins against Rock ");
        }

    }

}



   



