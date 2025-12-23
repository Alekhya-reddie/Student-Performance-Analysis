import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, marks);

        int total = ResultCalculator.calculateTotal(marks);
        double avg = ResultCalculator.calculateAverage(total, 5);
        String grade = ResultCalculator.calculateGrade(avg);

        System.out.println("\n--- STUDENT RESULT ---");
        System.out.println("Name: " + student.name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
