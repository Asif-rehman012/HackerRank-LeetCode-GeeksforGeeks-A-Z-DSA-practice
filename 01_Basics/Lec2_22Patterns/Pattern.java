
public class Pattern {
    // ! Pattern 1

    // public static void Pattern1(int n) {

    // for (int row = 1; row <= n; row++) {
    // for (int star = 1; star <= n; star++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // ! Pattern 2
    // public static void Pattern2(int n) {
    // for (int i = 1; i <= n; i++) { // outer loop i means row 1,2 etc
    // for (int star = 1; star <= i; star++) { // inner loop(star=colum of that row)
    // here works with i
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // }

    // ! pattern 3
    // public static void Pattern3(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int num = 1; num <= i; num++) {
    // System.out.print(num);
    // }
    // System.out.println();
    // }
    // }

    // ! Pattern 4
    // public static void Pattern4(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int num = 1; num <= i; num++) {
    // // printing i instead of num
    // System.out.print(i);
    // }
    // System.out.println();
    // }
    // }

    // ! Pattern 5
    // public static void pattern5(int n) {
    // for (int i = 1; i <= n; i++) { // i= row
    // for (int star = 1; star <= n - i + 1; star++) { // star= col
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // ! Pattern 6
    // public static void pattern6(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int num = 1; num <= n - row + 1; num++) {
    // System.out.print(num);
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 7
    // public static void pattern7(int n) {

    // for (int i = 1; i <= n; i++) {// outer loop - controls rows

    // // ist inner loop --> spaces
    // for (int spaces = 1; spaces <= n - i; spaces++) {
    // System.out.print(" ");
    // }

    // // 2nd inner loop --> stars
    // for (int stars = 1; stars <= 2 * i - 1; stars++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // }

    // ! pattern 8
    // public static void pattern8(int n) {
    // for (int i = n; i >= 1; i--) {
    // for (int spaces = 1; spaces <= n - i; spaces++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 9 =(7p+8p)

    // ! Pattern 10
    // public static void pattern10(int n) {
    // // todo UPPER PART
    // for (int i = 1; i <= n; i++) {
    // for (int star = 1; star <= i; star++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // // todo LOWER PART
    // for (int i = 1; i <= n; i++) {
    // for (int star = 1; star <= n - i; star++) {
    // System.out.print("*");

    // }
    // System.out.println();
    // }
    // }

    // ! pattern 11 binary num

    // public static void pattern11(int n) {
    // for (int i = 1; i <= n; i++) {

    // for (int j = 1; j <= i; j++) {

    // if ((i + j) % 2 == 0) {
    // System.out.print(1);
    // } else {
    // System.out.print(0);
    // }

    // }
    // System.out.println();
    // }
    // }

    // ! PATTERN 12
    // public static void pattern12(int n) {
    // int space = 2 * (n - 1);
    // // left part-- increasing nums
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }

    // // middle space
    // for (int s = 1; s <= space; s++) {
    // System.out.print(" ");
    // }

    // // right part -- decreasing numbers
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j);
    // }
    // System.out.println();
    // space -= 2;

    // }
    // }

    // ! PATTERN 13
    // static void pattern13(int n) {
    // int num = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {

    // System.out.print(num++ + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! PATTERN 14
    // static void pattern14(int n) {
    // for (int i = 1; i <= n; i++) {
    // // for (char ch = 'A'; ch <= 'A' + i; ch++) {
    // // System.out.print(ch);
    // // }

    // // OR

    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) ('A' - 1 + j) + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! PATTERN 15
    // static void pattern15(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print((char) ('A' - 1 + j) + " ");
    // }
    // System.out.println();
    // }
    // }

    // !PATTERN 16
    // public static void pattern16(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) ('A' - 1 + i) + " ");
    // }
    // System.out.println();
    // }
    // }

    // !Pattern 17
    // public static void pattern17(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int s = 1; s <= n - i; s++) { // spaces
    // System.out.print(" ");
    // }

    // for (int j = 1; j <= 2 * i - 1; j++) {
    // if (j <= i) {
    // System.out.print((char) ('A' - 1 + j) + " ");
    // } else {
    // System.out.print((char) ('A' - 1 + (2 * i - j)) + " ");
    // }
    // }

    // System.out.println();
    // }
    // }

    // ! Pattern 18
    // public static void pattern18(int n) {
    // for (int i = 0; i < n; i++) {
    // for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
    // System.out.print(ch);
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 19
    // public static void pattern19(int n) {
    // // upper half
    // for (int i = 0; i < n; i++) {
    // // left stars
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }

    // // spaces in the middle
    // for (int s = 0; s < 2 * i + 1; s++) {
    // System.out.print(" ");
    // }

    // // right stars
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // // lower half
    // for (int i = 0; i < n; i++) {
    // // left stars
    // for (int j = 0; j <= i; j++) {
    // System.out.print("*");
    // }

    // // spaces in the middle
    // for (int s = 0; s < 2 * (n - i - 1) + 1; s++) {
    // System.out.print(" ");
    // }

    // // right stars
    // for (int j = 0; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // ! Pattern 20
    // public static void pattern20(int n) {
    // int space = 2 * (n - 1);
    // // upper part
    // for (int i = 1; i <= n; i++) {
    // // star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // // space
    // for (int s = 1; s <= space; s++) {
    // System.out.print(" ");

    // }
    // // star
    // for (int j = i; j >= 1; j--) {
    // System.out.print("*");

    // }

    // System.out.println();
    // space -= 2;
    // }

    // // lower part
    // for (int i = n - 1; i >= 1; i--) {

    // // star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // // space
    // for (int j = 1; j <= (2 * n - 2 * i); j++) {
    // System.out.print(" ");
    // }

    // // star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // !PATTERN 21 hollow square
    public static void Pattern21(int n) {

        // Outer loop → rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → columns
            for (int j = 1; j <= n; j++) {

                // Print * if we are at the border (first/last row OR first/last column)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    // Inside → print space
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        // pattern8(5);
        // pattern9(5) // DIAMOND (Pattern7 + 8= 9th pattern)
        // pattern10(5);
        // pattern11(5);
        // pattern12(4);
        // pattern13(5);
        // pattern14(5);
        // pattern15(5);
        // pattern16(5);
        // pattern17(4);
        // pattern18(5);
        // pattern19(5);
        // pattern20(6);
        Pattern21(5);

    }
}