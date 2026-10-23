public class OOPsInheritance {
    /*
    Parent Class - Animal
    Child Class - Dog & Cat for Animal | Puppy for Dog & grand child of Animal
     */
    static class Animal {
        protected void eat() {
            System.out.println("Eating...");
        }
    }
    static class Dog extends Animal {
        // Now it can also access 'eat()' method from parent class (Animal)
        protected void bark() {
            System.out.println("Barking...");
        }
    }
    static class Puppy extends Dog {
        /*
        It can access 'bark()' from parent class (Dog)
        It can also access 'eat()' from Animal class
         */
        protected void weep() {
            super.eat();
            super.bark();
            System.out.println("Weeping...");
        }
    }
    static class Cat extends Animal {
        // Now it can also access 'eat()' method from parent class (Animal)
        void meow() {
            System.out.println("Meowing...");
        }
    }

    // Constructors & super keyword
    static class vehicle {
        vehicle() {
            System.out.println("Vehicle (Parent Class) here...");
        }
    }
    static class bike extends vehicle {
        bike() {
            super(); // Parent constructor gets called !!
            System.out.println("Bike - 2 wheeler (Child Class) here...");
        }
    }
    public static void main(String[] args) {
        /*
        Inheritance
        - Inheritance is a mechanism where one class (called the child class) acquires the properties
        and methods of another class (called the parent class).
        - The class whose features are inherited is called the Parent Class (Superclass),
        and the class that inherits those features is called the Child Class (Subclass).

        Types of Inheritance
        1. Single Inheritance
        - Single inheritance means one parent class and one child class.
        2. Multilevel Inheritance
        - In multilevel inheritance, a class inherits from another derived class, forming a chain.
        3. Hierarchical Inheritance
        -In hierarchical inheritance, multiple child classes inherit from the same parent class.

        Note
        - Java does not support multiple inheritance with classes to avoid the Diamond Problem.
        The Diamond Problem is a conflict that arises when two parent classes have a method with the same name,
        causing ambiguity for the child class. However, multiple inheritance can be achieved using interfaces.

        The super Keyword
        - The super keyword is used inside a child class to refer to the parent class.
        - It can be used to call the parent class constructor using super(),
        and to call a parent class method using super.methodName().
        - This is especially useful when the child class overrides a method but still needs to use the parent version.

        Advantages of Inheritance
        - Inheritance provides code reusability, meaning you write the logic once and use it across multiple classes.
        - It reduces redundancy by avoiding duplicate code across related classes.
        - It supports polymorphism by enabling method overriding in child classes.
        - It also promotes better organization by creating a logical and structured class hierarchy.

        Constructors in Inheritance
        - Constructors are not inherited in Java. However, when a child class object is created,
        the parent class constructor is automatically called first through an implicit super() call,
        and then the child class constructor executes.
        - Java automatically inserts super() as the first line in the child constructor if it is not explicitly written.
        This ensures that the parent part of the object is properly initialized before the child part.
         */

        bike b1 = new bike();

        Cat c1 = new Cat();
        c1.meow();
        c1.eat();

        Puppy p1 = new Puppy();
        p1.weep();
    }
}
