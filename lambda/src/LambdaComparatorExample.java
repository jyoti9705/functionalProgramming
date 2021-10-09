import java.util.Comparator;

public class LambdaComparatorExample {
    public static void main(String[] args) {
        //prior to Java8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                //o1 == o2 it will return 0;
                //o1 > o2 it will  return 1;
                //o2 < o2 it will return -1;
            }
        };
        System.out.println("Result of the comparator is :" + comparator.compare(3, 2));


        //after Java8
        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println("Result of comparator using Java8 is : "+ comparator1.compare(4,5) );

    }
}
