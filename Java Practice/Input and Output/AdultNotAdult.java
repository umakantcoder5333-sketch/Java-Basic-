import java.util.Scanner;
public class AdultNotAdult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Our Age Checking Calculator:");
        System.out.println("Please Enter your age :");
        int Age = input.nextInt();


        if(Age > 60){
            System.out.println("A person is Old:");
        }


else if(Age > 18){
            System.out.println("A person is an adult");

        } else{
            System.out.println("A person is not an adult:");
        }
    }
}



        

           

          