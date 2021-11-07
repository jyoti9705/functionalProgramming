import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatAndParseLocalDateTime {
    public static void parseLocalDateTime() {
        String dateTime = "2021-11-07T18:38:33";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("LocalDateTime : " + localDateTime);

        //custom format
        String dateTime1 = "2021-11-07T18|38|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("Local Date Time using Custom Formatter : " + localDateTime1);

    }

    public static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Formatted Date Time :" + formattedDateTime);

    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
