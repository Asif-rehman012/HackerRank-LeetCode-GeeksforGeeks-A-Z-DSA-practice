public static void pattern7(int n) {

        for (int i = 1; i <= n; i++) {// outer loop - controls rows

            // ist inner loop --> spaces
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            // 2nd inner loop --> stars
            for (int stars = 1; stars <= 2 * i - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }