import java.util.*;

public class Student
{
    private String name;
    private int id;
    private ArrayList<Integer> testScores;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        testScores = new ArrayList<>();
    }

    /**
     * Add a test score to the student
     * @param score The score to add
     */
    public void add(int score) {
        testScores.add(score);
    }

    /**
     * Gets the average test score of the student
     * @return The average score. If the student has no scores, it returns -1
     */
    public double getAverageTestScore() {
        if(testScores.isEmpty()) {
            return -1.0;
        }

        double total = 0;
        for(int score : testScores) {
            total += score;
        }

        return total / testScores.size();
    }

    /**
     * Get the student's name
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the student's ID
     * @return The ID
     */
    public int getId() {
        return id;
    }
}