import java.util.Scanner;
public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our checking senior citizen:");
        System.out.println("Enter your age:");
        int age = input.nextInt();

        if(age>60) {
            System.out.println(" senior citiizen:");
        }else if(age>18){
                System.out.println("people is an adult.");
        }else if(age>=13 ){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("you are a child.");
        }

            }
        }
    
