package TaskTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class VariantTwo {
    public static List<Integer> sort(Integer[] numbers) {
        List<Integer> sortedNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            Predicate<Integer> checkPositive = x -> x > 0;
            if (checkPositive.test(number)) {
                sortedNumbers.add(number);
            }
        }
        return sortedNumbers;
    }
}
