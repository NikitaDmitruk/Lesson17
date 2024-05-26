package TaskFour;

import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        double EXCHANGE_RATE = 3.23;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String sum = "500.54 BYN";
        Consumer<String> converter = x -> System.out.println(decimalFormat.format((Double.parseDouble(x
                .split("\\s")[0]) / EXCHANGE_RATE)) + " USD");
        converter.accept(sum);
    }
}

