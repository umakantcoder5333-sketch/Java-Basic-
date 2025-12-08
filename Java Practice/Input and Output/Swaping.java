import java.util.Scanner;
public class Swaping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swaping number");
        System.out.println("Enter value of A:");
        int a = input.nextInt();
        System.out.println("Enter value of B:");
        int b = input.nextInt();

        int c = a; 
        a = b;
        b = c;  

        System.out.println("Swapping number checking....");
        System.out.println("value of A :" + a);
        System.out.println("value of B is:" + b);
        


    }
}
