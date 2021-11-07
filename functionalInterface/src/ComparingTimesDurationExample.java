import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(23,33,49,234);
        Long minutes = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("Minutes diff "+ minutes);

        Duration duration = Duration.between(localTime,localTime1);
        System.out.println("Using Duration  Minutes diff is : "+ duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toHours : "+ duration1.toHours());


    }
}
