package TaskFive;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> reverseText = () -> {
            System.out.println("Введите строку:");
            Scanner scanner = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder(scanner.next());
            return stringBuilder.reverse().toString();
        };
        System.out.println(reverseText.get());
    }
}
