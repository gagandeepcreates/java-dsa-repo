public class Operators {
    public static void main(String[] args) {
        // Operators are special symbols used to perform operations on variables and values.

        int value1 = 6;
        int value2 = 4;

        int sum = value1 + value2;
        System.out.println(sum);
        // + is an operator to perform addition

        /*
        Types of Operations in JAVA
        1. Arithmetic Operators
        2. Assignment Operators
        3. Relational Operators
        4. Logical Operators
        5. Unary Operators
        6. Bitwise Operators
        7. Other Operators (instanceof, ternary)
         */

        // Arithmetic Operators
        int val1 = 6;
        int val2 = 4;
        int addition = val1 + val2;
        int subtraction = val1 - val2;
        int multiplication = val1 * val2;
        int division = val1 / val2;
        int modulo = val1 % val2;
        System.out.println(addition + " " + subtraction + " " + multiplication + " " + division + " " + modulo);

        // Assignment Operator
        int streak = 5;
        streak += 5;
        streak -= 5;
        streak *= 5;
        streak /= 5;
        streak %= 5;
        System.out.println(streak);

        // Relational Operator
        int current = 5;
        int past = 5;
        System.out.println(current == past); // true
        System.out.println(current != past); // false
        System.out.println(current >= past); // true
        System.out.println(current <= past); // true
        System.out.println(current > past); // false
        System.out.println(current < past); // false

        // Logical Operators
        boolean statement1 = true;
        boolean statement2 = false;
        System.out.println(statement1 && statement2);
        System.out.println(statement1 || statement2);
        System.out.println(!statement2);

        // Unary Operators
        /*
        Increment (++)
        pre-increment - (++a)
        post-increment - (a++)

        Decrement (--)
        pre-decrement - (--a)
        post-decrement - (a--)
         */

        // BitWise Operators
        int x = 6;  // 00000110
        int y = 3;  // 00000011

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x << 1); // multiply by 2
        System.out.println(x >> 1); // divide by 2

        /*
        Instance of Operator
        Checks whether an object belongs to a class.
         */
        String track = "Gagan";
        boolean result = track instanceof String;
        System.out.println(result); // true

        // Ternary Operator
        int solvedProblem = 300;
        String level = (solvedProblem >= 300) ? "Advanced" : "Intermediate";
        System.out.println(level);
    }
}
