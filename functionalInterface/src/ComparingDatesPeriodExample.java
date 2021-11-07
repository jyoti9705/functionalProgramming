import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 01, 01);
        LocalDate localDate1 = LocalDate.of(2021, 12, 31);
        Period period = localDate.until(localDate1);
        System.out.println("period : " + period);
        //Days just check dates and noting else
        System.out.println("period Days : " + period.getDays());
        System.out.println("period months : " + period.getMonths());
        System.out.println("period years : " + period.getYears());

        Period period1 = Period.ofDays(20);
        System.out.println("No of Days : " + period1.getDays());
        //similarly, we can do for years

        Period period2 = Period.between(localDate, localDate1);
        System.out.println("Period  days using between : " + period2.getDays());
        System.out.println("Period  Months using between : " + period2.getMonths());
        System.out.println("Period  Years using between : " + period2.getYears());
    }
}

