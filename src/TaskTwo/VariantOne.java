package TaskTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VariantOne {
    public static List<Integer> sort (Integer[] numbers) {
        return Arrays.stream(numbers).filter(number -> number > 0).collect(Collectors.toList());
    }
}
