import java.util.Scanner;
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Number Checking Calculator:");
        System.out.println("Please Enter your Number:");
        int num= input.nextInt();

        if (num > 0){
            System.out.println("Your Number is positive:");

        } else if(num < 0){
            System.out.println("Your number is Negative:");
        } else {
            System.out.println("Your number is zero:");
        }
    }
}
