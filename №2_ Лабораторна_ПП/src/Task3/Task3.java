package Task3;
import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.print("Grade is: ");
        Scanner scanner = new Scanner(System.in);
        student.setGrade(scanner.nextInt());

        System.out.print("Subject name is: ");
        Scanner scanner1 = new Scanner(System.in);
        student.setSubjectName(scanner1.nextLine());

        System.out.print("Student's name is: ");
        Scanner scanner2 = new Scanner(System.in);
        student.setName(scanner2.nextLine());

        System.out.print("Student's age is: ");
        Scanner scanner3 = new Scanner(System.in);
        student.setAge(scanner3.nextInt());

        System.out.println();

        System.out.println(student);
    }
}