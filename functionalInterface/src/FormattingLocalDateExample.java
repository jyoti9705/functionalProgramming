import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void parseLocalDate() {
        //Converting Sting to LocalDate
        String date = "2021-11-07";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 : " + localDate1);

        String date1 = "20211107";//yyyyMMdd
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("LocalDate2 : " + localDate2);

        //Custom Defined  date
        String date2 = "2021|11|07";
        //build your own custom Formatter in these cases
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("LocalDate3 with Custom DateTimeFormatter : " + localDate3);
    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter1);
        System.out.println("formattedDate : " + formattedDate);
    }

    public static void main(String[] args) {
        formatLocalDate();
        parseLocalDate();

    }
}
