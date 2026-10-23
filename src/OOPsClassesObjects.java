public class OOPsClassesObjects {
    static class  Car {
        String brand;
        String model;
        int year;
    }
    public static void main(String[] args) {
        /*
        Object-Oriented Programming (OOP) is the backbone of modern software development, and JAVA is one of the most prominent languages that fully
        embraces this paradigm. By organizing code into objects and classes, OOP enables developers to build scalable, maintainable, and reusable applications.

        Core Concepts of OOP in JAVA :
        1. Classes & Objects
        2. Encapsulation
        3. Inheritance
        4. Polymorphism
        5. Abstraction
        6. Modularity
         */

        /*
        Classes & Objects :
        A class is a blueprint or template used to create objects. It defines :
        - State (Variables / fields)
        - Behaviour (methods / functions)

        An Object is an instance of a class. When an object is created, memory is allocated,
        and it can use the properties and behaviours defined in the class.
         */

        Car carObj1 = new Car(); // Creating Object

        carObj1.brand = "Toyota";
        carObj1.model = "Corolla";
        carObj1.year = 2020;

        System.out.println(carObj1.brand + " " + carObj1.model + " " + carObj1.year);
        System.out.println();

        /*
        - A class doesn't occupy memory until an object is created.
        - Multiple objects can be created from a single class, each with different values.
         */
    }
}
