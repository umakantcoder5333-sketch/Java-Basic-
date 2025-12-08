import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our driving licence portsl:");
        System.out.println("please enter your age:");
        int age = input.nextInt();
        
        if(age>= 18){
            System.out.println("You are eligible to driving.");
        } else{
            System.out.println("Beta cycle chalao.");

        
        }
    }
}
