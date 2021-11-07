import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExamples {
    public static void main(String[] args) {
        //LocalDate of the System
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);

        //Returns instance date created
        LocalDate localDate1 = LocalDate.of(2021, 11, 8);
        System.out.println("LocalDate1 : " + localDate1);

        //returns appropriate Date fo the day and year
        LocalDate localDate2 = LocalDate.ofYearDay(2021, 365);
        System.out.println("LocalDate2 : " + localDate2);

        //Get values from LocalDate
        Month month = localDate.getMonth();
        System.out.println("Month is : " + month);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of Week is : " + dayOfWeek);

        Integer dayOfYear = localDate.getDayOfYear();
        System.out.println("Day of Year is : " + dayOfYear);

        System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

        //Modifying LocalDate
        //Each time we modify the localdate it creates new instance so that the original one remains as it is
        System.out.println("plusDays : " + localDate.plusDays(2));

        System.out.println("plusMonths : "+ localDate.plusMonths(2));

        System.out.println("minusDays : "+ localDate.minusDays(2));

        System.out.println("minusMonths : "+ localDate.minusMonths(1));

        System.out.println("withYear : "+ localDate.withYear(2022));

        System.out.println("With ChronoField : "+ localDate.with(ChronoField.YEAR,2023));

        System.out.println("With Temporal Adjusters : "+ localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("ChronoUnit Minus : "+ localDate.minus(1, ChronoUnit.YEARS));

        //Additional Support Methods

        System.out.println("Is Leap Year : "+localDate.isLeapYear());

        System.out.println("Is Leap Year Example2 : "+ LocalDate.ofYearDay(2022,01).isLeapYear());

        //How to check if two dates are equal

        System.out.println("is Equal : "+ localDate.isEqual(localDate1));

        //UnSupported Scenarios

        //Exception as localDate has no minutes at all
       /// System.out.println("chronounit minus time from Date" + localDate.minus(1 , ChronoUnit.MINUTES));

        //We can always check if the method is supported or not using isSupported
        System.out.println("isSupported : "+ localDate.isSupported(ChronoUnit.MINUTES));



    }

}
