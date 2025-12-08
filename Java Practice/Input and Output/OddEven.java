import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println(" welcome to odd even calculator\n");
        System.out.println(  "please enter your number: ");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("your number is even:");
        }else{
            System.out.println("your number is odd:");
        }
        }
    }

