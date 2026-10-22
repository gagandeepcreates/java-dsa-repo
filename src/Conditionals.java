public class Conditionals {
    public static void main(String[] args) {
        int marks = 89;

        // If Statement
        if (marks > 90) {
            System.out.println("A Grade");
        }

        // If-else Statement
        if (marks > 90)
            System.out.println("A Grade");
        else
            System.out.println("B Grade");

        // If-else-if Statement
        if (marks > 90)
            System.out.println("A Grade");
        else if (marks > 80 && marks <= 90){
            System.out.println("B Grade");
        }

        // Nested If-else Statement
        if (marks > 90) {
            if (marks > 95)
                System.out.println("A+ Grade");
            else
                System.out.println("A Grade");
        }
        else
            System.out.println("B Grade");

        // Ternary Operator

        String result = (marks > 90) ? "A Grade" : "B Grade";
        System.out.println(result);

        // Switch statement
        switch (marks) {
            case 88:
                System.out.println("88 marks");
                break;
            case 89:
                System.out.println("89 marks");
                break;
            default:
                System.out.println("None");
        }


    }
}
