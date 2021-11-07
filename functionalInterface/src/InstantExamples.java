import java.time.Instant;

public class InstantExamples {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant : "+ instant);
        System.out.println("getEpochSecond : "+ instant.getEpochSecond());
        System.out.println("getNano : "+ instant.getNano());
        System.out.println("Start of Epoch Second : "+Instant.ofEpochSecond(0));
    }
}
