import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to compound interest calculator:");
        System.out.println("please enter your pricniple amount Rs:");
        int principle = input.nextInt();
        System.out.println("Now, tell me your rate of Interest:");
        Float rate = input.nextFloat();
        System.out.println("Now, please tell me for how many are you  borrowing time :");
        Float years  = input.nextFloat();

        
    double CompInt  = principle * Math.pow((1 + rate / 100), years);
    System.out.println("your compound interes is Rs: + " + CompInt);
    }
    
}
