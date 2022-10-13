package games;

import java.util.Scanner;
public class RockPaperScissorsGame {

    Player player;

    Fist aIFist;

    RockPaperScissorsGame(String playerName,int playerScore){
    player = new Player ("Viktoria",0);
    aIFist =new Fist();
    }
    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("Viktoria",0);
        game.playGame();
    }
    void playGame(){
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < 3; i++){
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

    }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Rock against Rock - Tie");
                score1++; score2++;
    }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("You chose " +choice+ " and "+" AI chose "+ stringresult + ". Rock against Paper . You lose. AI win. ");
                score2++;
    }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Rock against Scissors. You win. AI lose.");
                score1++;
    }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Paper against Paper - Tie");
                score1++; score2++;
    }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Paper against Rock. You win. AI lose.");
                score1++;
    }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult +". Paper against Scissors. You lose. AI win.");
                score2++;
    }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("SCISSORS")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Scissors against Scissors - Tie");
                score1++; score2++;
    }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("ROCK")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult+". Scissors against Rock. You lose. AI win.");
                score2++;
    }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("PAPER")){
                System.out.println("You chose " +choice+ " and "+ " AI chose "+ stringresult + ". Scissors against Paper. You win. AI lose.");
                score1++;
            }
        }if(score1>score2){
            System.out.println("Result; You win");
        }
        else if (score2>score1){
            System.out.println("Result; AI win");
        }else{
            System.out.println("Result; Tie");
        }

    }
}




   



