import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void add() {
        Student student = new Student("Theo", 0);
        student.add(100);
        assertEquals(100, student.getAverageTestScore());
        student.add(90);
        assertEquals(95, student.getAverageTestScore());
    }

    @org.junit.jupiter.api.Test
    void getAverageTestScore() {
        Student student = new Student("James", 1);
        student.add(50);
        student.add(70);
        student.add(12);
        assertEquals(44, student.getAverageTestScore());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Student student = new Student("Theo", 0);
        assertEquals("Theo", student.getName());
    }

    @org.junit.jupiter.api.Test
    void getId() {
        Student student = new Student("James", 1);
        assertEquals(1, student.getId());
    }
}