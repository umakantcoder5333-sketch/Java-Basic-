import java.util.Scanner;
public class BitwiseNotOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to out Bitwise Not calculator\n");
        System.out.println("Please, enter your  number:");
        int num = input.nextInt();
         int result = ~num;
        System.out.println("result is:" + result);
}
}





// Bitwise Not ~ operator is an Unary operator so this is not work on two variable because this is unary not binary like And & OR || and XOR ^. 
//so if you write bitwise not ~ operator take only one variable. 