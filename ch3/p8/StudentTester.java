package comm.netcracker.homework3.ch3.p8;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("Gorskaya");

        student.addQuiz(70);
        student.addQuiz(60);
        student.addQuiz(50);

        System.out.println("Student name: " + student.getName());
        System.out.println("Total quiz score: " + student.getTotalScore());
        System.out.println("AverageScore: " + student.getAverageScore());
    }
}
