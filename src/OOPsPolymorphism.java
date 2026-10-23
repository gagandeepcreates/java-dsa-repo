public class OOPsPolymorphism {
    static class Print {
        void display (int num) {
            System.out.println("Integer : " + num);
        }
        void display (String name) {
            System.out.println("String : " + name);
        }
        void display (char special) {
            System.out.println("Character : " + special);
        }


        void print1() {
            System.out.println("Print from Parent class...");
        }
    }

    static class Paper extends Print {
        @Override
        void print1() {
            System.out.println("Print from Paper class...");
        }
    }
    static class Book extends Print {
        @Override
        void print1() {
            System.out.println("Print from Book class...");
        }
    }

    // Abstract Class & Abstract methods
    static abstract class Shape {
        abstract void draw(); // No body, child class should implement this..

        void display() {
            System.out.println("This is a sample shape");
        }
    }
    static class circle extends Shape {
        @Override
        void draw() {
            System.out.println("This is Circle Shape");
        }
    }
    public static void main(String[] args) {
        /*
        Polymorphism
        - The word Polymorphism comes from Greek, meaning "many forms".
        In simple terms, it means that one thing can behave in different ways depending on the situation.
        - In Java, polymorphism allows a single method, object, or interface to behave differently based on the context
        in which it is used. This makes code more flexible, reusable, and easier to maintain.

        Types of Polymorphism
        1. The first is Compile-time Polymorphism, also called Static Polymorphism.
        2. The second is Run-time Polymorphism, also called Dynamic Polymorphism.

        Compile-time Polymorphism (Static Polymorphism)
        - Compile-time polymorphism is the type of polymorphism that is resolved by the Java compiler during compilation itself,
        before the program runs. In Java, this is achieved through Method Overloading.

        - Method Overloading : Defining multiple methods with the same name in the same class, but with different parameters.
        The difference can be in the number of parameters, the type of parameters, or both.
        Java decides which method to call based on the arguments you pass at the time of the call.


        Run-time Polymorphism (Dynamic Polymorphism)
        - Run-time polymorphism is the type of polymorphism that is resolved during the execution of the program, not at compile time.
        In Java, this is achieved through Method Overriding combined with Inheritance. This is where the real power of polymorphism is seen in Java.

        - Method Overriding : Method overriding means that a child class defines a method with the same name and same parameters as a method in the parent class.
         When the method is called, Java decides at runtime which version to execute based on the actual object, not the reference type.

         */

        // Method Overloading
        Print p1 = new Print();
        p1.display(77);
        p1.display("Gagan");
        p1.display('*');

        // Method Overriding
        Print p2;

        p2 = new Paper();
        p2.print1();

        p2 = new Book();
        p2.print1();

        /*
        Abstract Classes and Abstract Methods
        - An abstract class in Java is a class that cannot be instantiated directly, meaning you cannot create an object of an abstract class.
        It is designed to be used only as a parent class. An abstract method is a method that has no body, meaning it has no implementation in the parent class.
        Any child class that extends an abstract class must provide the implementation for all abstract methods.
         */

        Shape s;

        s = new circle();
        s.draw();
        s.display();
    }
}
