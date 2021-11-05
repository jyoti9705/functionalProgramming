public class StreamsCountingExample {
    public static long count() {
        return StudentDataBase.getAllStudents().stream().count();
    }

    public static void main(String[] args) {
        System.out.println("No of Students in database : " + count());

    }
}
