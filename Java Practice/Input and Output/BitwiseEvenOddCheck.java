import java.util.Scanner;
public class BitwiseEvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our Bitwise Operator To Check Even Odd\n");
        System.out.println("Please Enter Your Number:");
        int num = input.nextInt();

        if((num & 1) == 1){
            System.out.println("your number is odd:");

        }    else{
            System.out.println("your number is even:");
        } 
    }
} 
