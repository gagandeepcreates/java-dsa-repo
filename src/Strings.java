public class Strings {
    public static void main(String[] args) {
        // A String is a sequence of characters.
        // String = collection of characters enclosed in double quotes

        // How to create String
        // Method 1
        String str = "Hello";

        // Method 2
        String str2 = new String("Hello");

        /*
        String is NOT a Primitive Type
        - String is an object (class)
        that's why it has methods(functions) like:
        length()
        charAt()
        equals()
         */

        // String Basics
        // Length of String
        String name = "Gagan";
        int nameLength = name.length();
        System.out.println(nameLength);
        System.out.println();

        // Access characters
        System.out.println(name.charAt(3)); // a (index starts from 0)

        // String are IMMUTABLE
        // Once a String is created, it cannot be changed

        name.concat("deep");
        System.out.println(name); // Gagan

        /*
        Why ?
        Because concat() does not modify the original string.
        It creates a new string.
         */

        // Correct way ->
        name = name.concat("deep");
        System.out.println(name); // Gagandeep

        /*
        Comparing Strings
        if (str1 == str2) is wrong way because this compares memeory address
        if (str1.equals(str2)) is correct way because compares actual string
         */

        /*
        sc.next() for one word
        sc.nextLine() for full line
         */

        // Basic String Problems
        // 1. Print each Character
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        // 2. Reverse a String
        String reversedName = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println(reversedName);

        // 3. Palindrome

        if (name.equals(reversedName)) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
