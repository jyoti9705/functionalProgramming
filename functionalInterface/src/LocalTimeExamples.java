import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : "+localTime);

        //methods to create LocalTime
        LocalTime localTime1 = LocalTime.of(23,33);
        System.out.println("LocalTime1 : "+ localTime1);

        LocalTime localTime2 = LocalTime.of(23,33,33);
        System.out.println("LocalTime2 : "+localTime2);

        //getting the values from LocalTime instance
        Integer hour= localTime.getHour();
        System.out.println("Hour of LocalTime : "+ hour);

        Integer minute = localTime.getMinute();
        System.out.println("Minute of LocalTime : "+ minute);

        System.out.println("Chrono Field CLOCK_HOUR_OF_DAY : "+ localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));

        System.out.println("TO Second of the Day : "+ localTime.toSecondOfDay());

        //Modify values of LocalTime

        System.out.println("minusHours : "+ localTime.minusHours(2));

        System.out.println("minusHours2  with ChronoUnit : "+ localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("MIDNIGHT : "+ localTime.with(LocalTime.MIDNIGHT));

        System.out.println("HOUR_OF_THE_DAY : "+ localTime.with(ChronoField.HOUR_OF_DAY,22));

    }

}
