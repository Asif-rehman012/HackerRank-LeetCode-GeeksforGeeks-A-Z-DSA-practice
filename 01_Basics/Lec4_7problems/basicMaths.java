
public class basicMaths {

    public static void CountDigits(int n) {

        int counter = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            counter = counter + 1;
            n = n / 10;

        }

    }

    public static void main(String[] args) {

        CountDigits(7789);
    }
}
