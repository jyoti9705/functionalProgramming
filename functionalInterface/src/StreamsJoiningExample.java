import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String joining_1() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(","));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(",", "(", ")"));
    }

    public static void main(String[] args) {

        System.out.println("Joining 1 Example : " + joining_1());
        System.out.println("Joining 2 Example : " + joining_2());
        System.out.println("Joining 3 Example : " + joining_3());

    }
}
