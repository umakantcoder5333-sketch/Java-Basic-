import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("welcome to age calculator");
        System.out.println("please enter your age:");
        int age = input.nextInt();

        if (age >= 65){
            System.out.println("you are a senior citizen:");
            
        } else if(age >= 20){
            System.out.println("you have an adult:");

        } else if(age >= 13){
            System.out.println("you have a teenager:");

        } else {
            System.out.println("you have a child:");
        }
        }
    }

