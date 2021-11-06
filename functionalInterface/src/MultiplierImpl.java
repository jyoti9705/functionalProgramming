import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (x, y) -> x * y);
    }

    public Integer sizeOfList(List<Integer> integerList) {
        System.out.println("Inside Multiplier Impl");
        return integerList.size();
    }
}
