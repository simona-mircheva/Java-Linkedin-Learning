import java.util.Locale;
import java.util.Scanner;

public class MultipleQuestion {
    public static void main(String[] args) {
        String question = "What is the capital of Bulgaria?";
        String choiceOne = "veliko tarnovo";
        String choiceTwo = "sofia";
        String choiceThree = "plovdiv";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (correctAnswer.equals(userInput.toLowerCase())){
            System.out.println("Congratulations! This is the correct answer.");
        }
        else {
            System.out.println("Incorrect.The correct answer is: " + correctAnswer);
        }
    }
}
