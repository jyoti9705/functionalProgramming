public class AnyAllNoneMatchExample {
    public static Integer anyMatchExample(String word) {
        Boolean match = word.chars().anyMatch(c -> c == 'I');
        int count = match ? (int) word.chars().filter(c -> c == 'I').count() : 0;
        return count;

    }

    public static Boolean allMatchExample(String word) {
        return  word.chars().allMatch(c -> c == 'I');

    }

    public static Boolean noneMatchExample(String word) {
        return  word.chars().noneMatch(c -> c == 'W');

    }

    public static void main(String[] args) {
        String name = "JYOTI SINGH";
        System.out.println("Count of I in Word ".concat(name).concat(" is ").concat(String.valueOf(anyMatchExample(name))));
        System.out.println("All chars match I : " + allMatchExample(name));
        System.out.println("None chars match W : "+ noneMatchExample(name));
    }
}
