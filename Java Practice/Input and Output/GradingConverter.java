import java.util.Scanner;
public class GradingConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Grade Claculator\n");
        System.out.println("Please enter your percentage:");
        float percentage = input.nextFloat();

        if (percentage >= 90){
            System.out.println("Your have got A");
            
        } else if(percentage >= 75){
            System.out.println("you have got B");
        } else if(percentage >= 60){
            System.out.println("you have got C, work harder next time");
        } else if(percentage >= 30){
            System.out.println("you have got D you seriously need to hard work");
        } else{
            System.out.println(" Sorry you have failed the text");
        }
        }
    }

