import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] options = { "Rock", "Paper", "Scissors" };
        printInstructions(options);
        String computerOption = options[new Random().nextInt(3)];
        String userOption;
        userOption = wordFormat(scan.next());
        Decision playGame = new Decision(userOption, computerOption);
        playGame.checkWinner(playGame.getUserValue(), playGame.getComputerValue());
        scan.close();
    }

    static void printInstructions(String[] options) {

        System.out.println("Welcome to rock, paper, scissors");
        System.out.println("Choose between the three options to start the game");
        for (int i = 0; i < options.length; i++) {
            System.out.println("Option " + (i + 1) + " " + options[i]);
        }

    }

    static String wordFormat(String word){
        String newWord = word.toLowerCase();
    return newWord.substring(0, 1).toUpperCase() + newWord.substring(1);
    }
}
