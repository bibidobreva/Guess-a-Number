import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerNumber = randomNumber.nextInt(100);

        System.out.println("Welcome to the GUESS A NUMBER game!");
        boolean playerGuess = true;

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 58) {
                    isValid = false;
                    System.out.println("Invalid input");
                    break;
                }
            }

            if (isValid) {
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber) {
                    System.out.println("You win! The number is " + computerNumber);
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too high");
                } else if (playerNumber < computerNumber) {
                    System.out.println("Too low");
                }

            }


        }
    }
}