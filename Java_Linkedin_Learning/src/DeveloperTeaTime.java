import java.util.Scanner;

public class DeveloperTeaTime {
    public static void developerTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and hit enter.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");

        developerTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        developerTeaTime();

        System.out.println("Get promoted!");



    }
}
