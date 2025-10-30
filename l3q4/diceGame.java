package l3q4;
import java.util.Random;
public class diceGame {
    public static void main(String[] args) {
        Random r=new Random();
        int dice1Player1=r.nextInt(6)+1;
        System.out.println("Dice 1 for player 1: "+dice1Player1);
        int dice2Player1=r.nextInt(6)+1;
        System.out.println("Dice 2 for player 1: "+dice2Player1);
        int dice1Player2=r.nextInt(6)+1;
        System.out.println("Dice 1 for player 2: "+dice1Player2);
        int dice2Player2=r.nextInt(6)+1;
        System.out.println("Dice 2 for player 2: "+dice2Player2);
        int sum1=dice1Player1+dice2Player1;
        System.out.println("Total score for player 1: "+sum1);
        int sum2=dice1Player2+dice2Player2;
        System.out.println("Total score for player 2: "+sum2);
        if(sum1>sum2){
            System.out.print("Player 1 wins the game.");
        }else if(sum2>sum1){
            System.out.print("Player 2 wins the game.");
        }else{
            System.out.print("Draw");
        }
    }
}
