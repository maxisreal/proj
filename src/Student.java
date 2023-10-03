public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        testScoreCount = 0;
        accumulatedTestScores = 0;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }
    public boolean isPassing() {
        return (averageTestScore() >= 65);
    }
    public void extraCredit(double grade) {
        if (grade > 100) {
            accumulatedTestScores += 100;
        } else {
            accumulatedTestScores += grade;
        }
    }
    public double averageTestScore() {
        return accumulatedTestScores/testScoreCount;
    }
    public void avgManyTests(double avg, int tests) {
        testScoreCount += tests;
        accumulatedTestScores += tests*avg;
    }
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + getFirstName()+ " " +getLastName());
        System.out.println("Graduation year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Is passing: " + isPassing());
    }

}
