public class DataTypes {
    public static void main(String[] args) {
        // A data type specifies the type of data that a variable can hold.

        int age = 19;
        /*
        int -> DataType
        age -> variable name
         */
        System.out.println(age);

        // Primitive DataTypes
        // Java has 8 predefined primitive data types. These are the most basic data storage types.

        boolean isTrueOrFalse = true;
        // by default 'false'
        // Size - 1-bit
        System.out.println(isTrueOrFalse);

        byte level = 5;
        // Range - (-128 to 127)
        // Size - 8-bit
        System.out.println(level);

        short order = 100;
        // Range - (-32,768 to 32,767)
        // Size - 16-bit
        System.out.println(order);

        int data = 555;
        // Range - (-2^31 to 2^31 - 1)
        // Size - 32-bit
        System.out.println(data);

        long large = 10203040;
        // Range - (-2^63 to 2^63 - 1)
        // Size - 64-bit
        System.out.println(large);

        double extraLarge = 2030405973;
        // 64 bit floating point
        System.out.println(extraLarge);

        float decimal = 33.6F;
        // Notice the F. Without F, Java treats decimal values as double.
        // 32 bit floating point
        System.out.println(decimal);

        char character = '&';
        // Stores a single Unicode Character
        // Size - 16-bit
        System.out.println(character);

        /*
        Java also supports reference types, such as:
        String
        Arrays
        Classes
        Objects
         */

        String statement = "My name is Gagan";
        System.out.println(statement);
        // Strings are not primitive. They are objects of Java.lang.String.


    }
}
