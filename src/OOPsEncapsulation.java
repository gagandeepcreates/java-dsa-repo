public class OOPsEncapsulation {
    static class Student {
        public String name;
        public int age;
        private String code = "55dd77hh";
        protected int salary;

        // Additional layer called getter to return private modifier
        public String getCode() {
            return code;
        }

        // Additional layer called setter to set private modifier
        public void setCode(String code) {
            this.code = code;
        }
    }
    public static void main(String[] args) {
        /*
        Encapsulation
        - Encapsulation is the concept of binding data and methods together into a single unit (class) while restricting direct access to some components.

        Why it is important ?
        - Protects data from unintended changes.
        - Enhances security
        - Improves code maintainability.

        Function of Encapsulation ?
        - Provides a secure layer.
        - Hides internal implementation in code and data in a class.
        - Exposes only necessary information to the external world.

        How it is Achieved ?
        - Using access modifiers:
        1. private -> accessible only within class
        2. protected -> accessible within the package and subclasses
        3. public -> accessible from anywhere
         */

        Student st1 = new Student();

        st1.name = "Gagan";
        st1.age = 19;
        st1.code = "badboy"; // can be accessed because this is "within the class" & this overrides the original code that is '55dd77hh'
        /*
        - To set the private modifier
        st1.setCode("88gg99jj");
         */

        System.out.println(st1.name + " " + st1.age + " " + st1.getCode() + " " + st1.salary);

        /*
        - Instead of accessing values directly, we use getters and setters, ensuring controlled access.
        - It improves maintainability by isolating changes within a class
        - It enhances code quality by enforcing validation through methods
        - It promotes better design by separating internal logic from external access
         */
    }
}
