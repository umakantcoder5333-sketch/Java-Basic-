import java.util.Scanner;
public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase of Not/Compliment Operator\n");
        System.out.println(" Please, enter the  number:");
        int num = input.nextInt();

       
        int result = ~num;
        System.out.println("your result is:" + result);
    }
}
