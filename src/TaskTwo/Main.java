package TaskTwo;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, 4, -5, -3};
        System.out.println(VariantOne.sort(numbers));
        System.out.println(VariantTwo.sort(numbers));
    }
}
