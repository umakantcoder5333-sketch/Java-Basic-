import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.println("Welcome TO OUr Leap Year Checking  Calculator");
     System.out.println("Enter Your Year");
     int year = input.nextInt();


     if (year % 400 == 0){
        System.out.println("Leap year");

     }
    else if(year % 100 == 0){
        System.out.println("Not a Leap year");

    }
    else if(year % 4 == 0){
        System.out.println("Leap year");

    } else {
        System.out.println("Not a Leap year");

    }
}
    }
//we can write this type also this is also easy.
// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter a year:");
//         int year = input.nextInt();

//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     System.out.println("Leap Year");
//                 } else {
//                     System.out.println("Not a Leap Year");
//                 }
//             } else {
//                 System.out.println("Leap Year");
//             }
//         } else {
//             System.out.println("Not a Leap Year");
//         }
//     }
// }





// import java.util.Scanner;
// public class LeapYeae {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//     System.out.println("Welcome to our New Year Calculator\n");
// System.out.println("Please enter the year that you  want to check the year is leap or not:  ");
// int year = input.nextInt();

// if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//     System.out.println("Your year is a leap year");
// // } else if (year % 100 == 0){
// //     System.out.println("your year is not a leap year");


// // } else if (year  % 4 == 0){
// //     System.out.println("your year is a leap year");

// } else {
//     System.out.println("your year is not a leap year");
// }
// }
// }  