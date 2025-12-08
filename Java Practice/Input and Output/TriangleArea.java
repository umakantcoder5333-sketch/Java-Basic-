import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to area calculator\n:");
        System.out.println("please enter your base in cms:");
        double base = input.nextDouble();
        System.out.println("Now, enter your perpendicular height and in cms:");
        double height = input.nextDouble();

        //double area = 0.5 * base * height;
        // we should also this write both are same.
        double area = (base * height) / 2;
        System.out.println("The area of your triangle is : " + area + "cms2");



    }
}
