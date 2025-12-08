//package Input and Output;
import java.util.Scanner;
public class startingInput {
public static void main(String[] args) {
    System.out.println("Please Enter your name:");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Welcome" + name + " To java coding!");
}
}

