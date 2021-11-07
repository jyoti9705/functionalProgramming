import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time : " + zonedDateTime);

        System.out.println("zone off set : "+ zonedDateTime.getOffset());

        System.out.println("Zone Id : "+ zonedDateTime.getZone());

        //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        System.out.println("No of Available Zones : "+ ZoneId.getAvailableZoneIds().size());

        //ZonedDateTime to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("LocalDateTime : "+ localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Calcutta")));
        System.out.println("Using Clock : "+ localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println("Using Instant : "+ localDateTime2);

        //LocalDateTime , Instant to ZonedDateTIME
        LocalDateTime localDateTime3 = localDateTime.now();
        System.out.println("LocalDateTime3 : "+ localDateTime3);

        System.out.println("AtZone : "+ localDateTime3.atZone(ZoneId.of("Asia/Calcutta")));
        Instant instant = Instant.now();
        System.out.println("Instant : "+ instant);
        System.out.println("ZonedDateTime from Instant : "+ instant.atZone(ZoneId.of("Asia/Calcutta")));
        System.out.println("OffSet dATE AND Time : "+ localDateTime.atOffset(ZoneOffset.ofHours(2)));

    }
}
