import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        //LocalDate

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //LocalDate is type of Temporal

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        //LocalTime is temporal

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime );

    }
}
