public class basicMaths {

    public static int CountDigits(int n) {
        int temp = n;
        int count = 0;

        while (temp != 0) {
            int rem = temp % 10;
            if (rem != 0 && n % rem == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = CountDigits(7780);
        System.out.println(ans); // print result
    }
}
