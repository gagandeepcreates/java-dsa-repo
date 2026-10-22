public class Loops {
    public static void main(String[] args) {
        // Loops allow us to execute a block of code repeatedly.

        /*
        3 types of Loops in Java
        1. For Loop
        2. while Loop
        3. do-while Loop
         */

        /*
        FOR LOOP

        for (initialization, condition, update) {
        }
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("First 5 numbers printed");

        /*
        WHILE LOOP

        while (condition) {
        }
         */
        int count = 5;
        while (count >= 0) {
            System.out.println(count);
            count--;
        }

        /*
        DO-WHILE LOOP

        do {

        } while (condition);

        It excutes atleast once !!
         */

        /*
        Loop controls
        1. break
        2. continue
         */

    }
}
