import java.util.Scanner;
public class RithtShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our Right Shift Operator\n");
        System.out.println("Please Enter your number:");

        int num = input.nextInt();
        int result = num >> 1;
        System.out.println(" your result is:" + result);
    }
    }

