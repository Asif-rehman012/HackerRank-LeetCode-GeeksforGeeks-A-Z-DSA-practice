import java.util.*;

public class assignment4 {

    public static void main(String[] args) {
        // QUestion no 1 How many times 'Hello' is printed
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        // question no 2
        // Question 2 : Write a program that reads a set of integers, and then prints
        // the sum of the
        // even and odd integers
        Scanner sc = new Scanner(System.in);
        // System.out.println("write down the integer no =");

        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do {
        // number = sc.nextInt();

        // if (number % 2 == 0) {
        // evenSum += number;
        // } else {
        // oddSum += number;
        // }
        // System.out.println("Do you want to continue press 1 for yes 0 for no");
        // choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("sum of even nos " + evenSum);
        // System.out.println("sum of odd nos " + oddSum);

        // Q3 Write a program to find the factorial of any number entered by the user
        // int num; // To hold number
        // int fact = 1; // To hold factorial
        // System.out.print("Enter any positive integer: ");
        // num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        // fact *= i;
        // }
        // System.out.println("Factorial: " + fact);

        // Question 4 : Write a program to print the multiplication table of a number N,
        // entered by the
        // user.

        System.out.println("print the multiplication table of any number");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
