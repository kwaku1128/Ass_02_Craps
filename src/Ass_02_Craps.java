import java.util.Random;
import java.util.Scanner;
public class Ass_02_Craps {
    public static void main(String[] args ) {
        Random dice =new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            int roll1 = dice.nextInt(6) + 1;
            int roll2 = dice.nextInt(6) + 1;
            int sum = roll1 + roll2;
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You crapped out and lost.");
            } else if (sum == 7 || sum == 11) {
                System.out.println(" It is a Natural win, Congrats");
            } else {
                int target = sum;
                System.out.println("The sum is now" + target);

                boolean gameOver = false;
                while (!gameOver) {
                    roll1 = dice.nextInt(6) + 1;
                    roll2 = dice.nextInt(6) + 1;
                    sum = roll1 + roll2;
                    System.out.println("You rolled" + roll1 + " +" + roll2 + " =" + sum);

                    if (sum == target) {
                        System.out.println("Scored and won! congrats!");
                        gameOver = true;
                    } else if (sum == 7) {
                        System.out.println("You got a Seven and Lost!.");
                        gameOver = true;
                    } else {
                        System.out.println(" Trying for a Point.");
                    }
                }
            }

            System.out.println("play again? (y/n);");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for Playing the game!");
    }
}
