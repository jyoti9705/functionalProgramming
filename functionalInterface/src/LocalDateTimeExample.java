import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime now : "+ localDateTime);

        //create LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.of(2021,9,05,23,33);
        System.out.println("Local Date Time 1 Created : "+ localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("LocalDateTime Using LocalDate and LocalTime : "+ localDateTime2);

        //Getting values from localDateTime
        System.out.println("hour : "+ localDateTime.getHour());
        System.out.println("DayOfMonth : "+ localDateTime.getDayOfMonth());

        //Converting LocalDate, LocalTime to LocalDateTime and viceVersa
        LocalDate localDate = LocalDate.now();
        System.out.println("atTime : "+ localDate.atTime(LocalTime.now()));

        LocalTime localTime = LocalTime.now();
        System.out.println("At Date : "+ localTime.atDate(LocalDate.now()));

        //LocalDateTime to LocalDate and LocalTime
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("ToLocalDate : "+ localDateTime3.toLocalDate());
        System.out.println("ToLocalTime : "+ localDateTime3.toLocalTime());

    }
}
