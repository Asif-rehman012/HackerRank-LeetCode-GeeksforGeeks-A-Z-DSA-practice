import java.util.Scanner;

public class L1_BasicThings {
    // !PROBLEM 1
    // ! Complete the function PrintNumber which takes an integer input from the
    // ! user and prints it on sceen

    // public static void PrintNumber() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter any integer value :");
    // int num = sc.nextInt();
    // System.out.println("Number Entered is : " + num);
    // }

    // ! PROBLEM 2
    // ! CHECK input string & return size in bytes
    // static int dataTypeSize(String str) {
    // // if their is a "character return 2 bytes"
    // if (str.equals("Character")) {
    // return 2;

    // } else if (str.equals("Integer")) {
    // return 4;
    // }

    // else if (str.equals("Long")) {
    // return 8;

    // } else if (str.equals("Float")) {
    // return 4;
    // } else if (str.equals("Double")) {
    // return 8;
    // }

    // return -1;
    // }

    // !PROBLEM 3 IF ELSE STATEMENTS
    // ! check marks of student and give grades A,B,C,D, else fail
    // public static void StudentGrade(int marks) {
    // if (marks >= 90) {
    // System.out.println("Grade A");
    // } else if (marks >= 70) {
    // System.out.println("Grade B");
    // } else if (marks >= 50) {
    // System.out.println("Grade C");
    // } else if (marks >= 35) {
    // System.out.println("Grade D");
    // } else {
    // System.out.println("Fail");
    // }
    // }

    // ! PROBLEM NO. 4 SWITCH CASE
    // ! Print the day of week. values less than 1 or grater than 7 are Invalid
    // public static void CheckDay(int day) {

    // switch (day) {
    // case 1:
    // System.out.println("Monday");
    // break;
    // case 2:
    // System.out.println("Tuesday");
    // break;
    // case 3:
    // System.out.println("Wenesday");
    // break;
    // case 4:
    // System.out.println("Thrusday");
    // break;
    // case 5:
    // System.out.println("Friday");
    // break;
    // case 6:
    // System.out.println("Saturday");
    // break;
    // default:
    // System.out.println("Invalid");
    // break;
    // }
    // }

    // !Problem 6
    // ! What are arrays, Strings ?
    // public static void arrayStr() {
    // // Declare an array of integers with a length of 5
    // int[] myArray = new int[5];

    // // Assign values to the elements of the Array
    // myArray[0] = 1;
    // myArray[1] = 2;
    // myArray[2] = 3;
    // myArray[3] = 4;
    // myArray[4] = 5;

    // // print elements
    // // Access the Elements of array using square brackets operator
    // System.out.println("first element " + myArray[2]);
    // System.out.println("4th element " + myArray[3]);

    // // Declare and initialize an array of Integers in one line
    // int[] myOtherArray = { 1, 2, 3, 4, 5 };
    // System.out.println("second array of myOtherArray list " + myOtherArray[1]);

    // }

    // ! 06 ForLOOPS
    // static int fibonacci(int n) {
    // if (n == 1 || n == 0)
    // return 1;

    // return fibonacci(n - 3) + (n - 5);
    // }

    // 2nd approach using loops
    // static int fibonacci(int n) {
    // if (n <= 1) {
    // return n;
    // }
    // int a = 0, b = 1, c = 0;
    // for (int i = 1; i <= n; i++) {
    // System.out.print(a + " , ");
    // c = a + b;

    // a = b;
    // b = c;
    // }

    // return b;

    // }

    // ! PROBLEM 7 WHile Loop (Print Table)
    // public static void printTable(int n) {

    // // Time Complexity = O(1), Space Complexity = O(1)

    // // Initialize the variable
    // int i = 10;

    // // Iterate from 10 down to 1
    // while (i >= 1) {
    // // Print the result of n multiplied by the current value of i, followed by a
    // // space
    // System.out.print((n * i) + " ");

    // i--; // Decrement the counter
    // }

    // // Print a newline character to ensure output is formatted correctly
    // System.out.println();
    // }

    // ! PROBLEM 8
    // ! Pass by value Pass by refrence
    // Function to pass value by value
    static void addValue(int a) {
        a = a + 1; // add 1
        System.out.println(a + " ");

    }

    // Function to pass value by refrence (using wrapper class)
    static void addReference(IntWrapper b) {
        b.value = b.value + 2; // add 2
        System.out.print(b.value);

    }

    // P8
    // Helper class to mimic "pass by refrence"
    static class IntWrapper {
        int value;

        IntWrapper(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // PrintNumber(); //P1

        // System.out.println(dataTypeSize("Character"));//p2
        // StudentGrade(55); //P3
        // CheckDay(6); //P4
        // arrayStr(); //P5

        // int n = 6;
        // System.out.println("Fibonacci of " + n + " is : " + fibonacci(n)); //P6
        // printTable(5); //P7

        int a = 1;
        IntWrapper b = new IntWrapper(2);

        addValue(a);
        addReference(b);

    }

}