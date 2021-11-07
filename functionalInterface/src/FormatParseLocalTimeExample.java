import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatParseLocalTimeExample {
    public  static void parseTime(){
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("LocalTime : "+ localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1 : "+ localTime1);

        //custom defined format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1,dateTimeFormatter);
        System.out.println("LocalTime using custom formatter : "+ localTime2);
    }
    public  static  void  formatTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime = LocalTime.now();
        String formattedTime = localTime.format(dateTimeFormatter);
        System.out.println("formattedTime : "+ formattedTime);
    }
    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
