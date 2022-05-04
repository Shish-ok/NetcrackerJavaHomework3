package comm.netcracker.homework3.ch3.p8;

public class Student {
    private final String name;
    private double totalQuizScore;
    private int countQuizzes;

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public double getTotalScore() { return totalQuizScore; }

    public void addQuiz(int score) {
        totalQuizScore += score;
        ++countQuizzes;
    }

    public double getAverageScore() { return totalQuizScore / countQuizzes; }
}
