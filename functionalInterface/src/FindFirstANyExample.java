import java.util.List;
import java.util.Optional;

public class FindFirstANyExample {
    public static Optional<Student> getFirstFemale(List<Student> studentList){
        return studentList.stream().filter(s->s.getGender()=="female").findFirst();
    }

    public static Optional<Student> getAnyFemale(List<Student> studentList){
        return studentList.stream().filter(s->s.getGender()=="female").findAny();
    }
    public static void main(String[] args) {
        System.out.println("First Female value is : ".concat(String.valueOf(getFirstFemale(StudentDataBase.getAllStudents()))));
        System.out.println("First Any Female value is : ".concat(String.valueOf(getAnyFemale(StudentDataBase.getAllStudents()))));
    }
}
