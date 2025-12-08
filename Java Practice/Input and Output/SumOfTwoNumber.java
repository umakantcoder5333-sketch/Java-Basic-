import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our basic calculator:");
        System.out.println("Enter your the first Number:");
        int firstNum = input.nextInt();
        System.out.println("Now, please enter the second number:");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of  your number is :" + sum);
    }
    
}
