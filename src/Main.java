import java.util.*;

public class Main {

    public static void main() {
        ArrayList<Student> students = new ArrayList<>();

        // Load data
        Student s1 = new Student("Alice", 101);
        s1.add(85);
        s1.add(90);
        s1.add(78);
        students.add(s1);

        Student s2 = new Student("Bob", 102);
        s2.add(92);
        s2.add(88);
        s2.add(95);
        students.add(s2);

        Student s3 = new Student("Charlie", 103);
        s3.add(70);
        s3.add(60);
        s3.add(65);
        students.add(s3);

        // Print all student grades
        System.out.println("Processing...");
        for(Student student : students) {
            double averageTestScore = student.getAverageTestScore();
            String grade;
            if (averageTestScore >= 90) {
                grade = "A";
            } else if (averageTestScore >= 80) {
                grade = "B";
            } else if (averageTestScore >= 70) {
                grade = "C";
            } else if (averageTestScore >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("ID: " + student.getId() + " | Name: " + student.getName() + " | Avg: " + averageTestScore + " | Grade: " + grade);
        }

        // Find the best student
        double bestScore = -1;
        String bestStudentName = "";
        for (Student student : students) {
            if (student.getAverageTestScore() > bestScore) {
                bestScore = student.getAverageTestScore();
                bestStudentName = student.getName();
            }
        }
        System.out.println("Top: " + bestStudentName + " with " + bestScore);

        // Find failing students
        System.out.println("Needs Help:");
        for(Student student : students) {
            if(student.getAverageTestScore() < 70) {
                System.out.println(student.getName());
            }
        }
    }
}