public class BasicMath {
    public static void main(String[] args) {
        /*
        Important points-

        - Division in JAVA
        1. When both operands are integers, Java performs integer division.

        - Modulo in JAVA
        2. This operator returns remainder.

        - Extract last digit
        n % 10

        - Remove last digit
        n / 10
         */

        // 1. Count Digits in a number
        int num = 12345;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Count Digits in a number : " + count);

        // 2. Sum of digits
        int num2 = 12345;
        int sum = 0;

        while (num2 > 0) {
            int digit = num2 % 10;
            sum += digit;
            num2 = num2 / 10;
        }
        System.out.println("Sum of Digits : " + sum);

        // 3. Reverse a number
        int num3 = 12345;
        int rev = 0;

        while (num3 > 0) {
            int digit = num3 % 10;
            rev = rev * 10 + digit;
            num3 = num3 / 10;
        }
        System.out.println("Reverse a number : " + rev);

        // 4. Prime Number
        int n = 7;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        // 5. GCD & LCM
        int x = 12;
        int y = 18;

        int a = x;
        int b = y;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("GCD = " + gcd + " and LCM = " + lcm);

        // 6. Armstrong Number
        int armNum = 153;
        int original = armNum;
        int sumArm = 0;

        while (armNum > 0) {
            int digit = armNum % 10;
            sumArm = sumArm + (digit * digit * digit);
            armNum = armNum / 10;
        }

        if (original == sumArm)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is not an Armstrong Number");

        // 7. Perfect Number
        int perfect = 6;
        int perfSum = 0;

        for (int i = 1; i < perfect; i++) {
            if (perfect % i == 0)
                perfSum += i;
        }

        if (perfect == perfSum)
            System.out.println(perfect + " is a perfect number");
        else
            System.out.println(perfect + " is not a perfect number");


    }
}
