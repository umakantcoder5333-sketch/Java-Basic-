import java.util.Scanner;
public class BitwiseOROperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("welcome to our OR operator:");
System.out.println("Please, enter the first your number:");
int first = input.nextInt();
System.out.println("Please, enter your second number:");
int second = input.nextInt();

int result = first | second;
System.out.println("Result: "+ result);
}
}
