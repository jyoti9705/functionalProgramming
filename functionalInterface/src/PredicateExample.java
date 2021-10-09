import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> checkEvenPredicate = (a) -> a % 2 == 0;
    static Predicate<Integer> checkDivisibleByFive = (a) -> a % 5 == 0;

    public static void main(String[] args) {
        //For single line expression we need not add  brackets
        System.out.println(checkEvenPredicate.test(20));
        predicateAnd();
        predicateOr();
        predicateNot();
        predicateNegate();

    }

    public static void predicateAnd() {
        System.out.println(checkEvenPredicate.and(checkDivisibleByFive).test(20)); //predicateChaining
    }

    public static void predicateOr() {
        System.out.println(checkEvenPredicate.or(checkDivisibleByFive).test(25));
    }

    public static void predicateNot() {
        System.out.println(!checkEvenPredicate.test(25));
    }

    public static void predicateNegate() {
        System.out.println(checkEvenPredicate.negate().test(20));
    }

}
