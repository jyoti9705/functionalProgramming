import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {
    public static void main(String[] args) {
        //java.util.date to LocalDate and vice versa
        Date date = new Date();
        System.out.println("Util Date : "+ date);
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("LocalDateTime : "+ localDateTime);

       // Date date1 = new Date();




        //java.sql.date to LocalDate and vice versa
        LocalDate localDate = LocalDate.now();
        java.sql.Date date1 = java.sql.Date.valueOf(localDate);
        // LocalDate localDate = date1.toLocalDate();
        System.out.println("LocalDate : "+ date1.toLocalDate());


    }
}

