import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("Playing current song.");
            System.out.println("Do you want to go to the next song? Answer with yes/no.");
            String userInput = input.next();

            if (userInput.equals("yes")){
                isOnRepeat = false;
            }

        } System.out.println("Playing next song.");
    }
}
