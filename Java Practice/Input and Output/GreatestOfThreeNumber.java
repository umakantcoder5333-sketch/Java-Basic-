
import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to the world of Three\n");
    System.out.println("please enter your first Number:");
    int first = input.nextInt();

    System.out.println("Now, enter your second number:");
    int second = input.nextInt();
    System.out.println("Finally,enter your third number:");
    int third = input.nextInt();

    if(first >= second && first >= third){
        System.out.println(first + " is the greatest number");
    } else if(second >= first && second >= third){
        System.out.println(second + "is the greatest number");
        
    }
    }
    }