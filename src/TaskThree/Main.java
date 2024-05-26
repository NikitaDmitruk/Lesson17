package TaskThree;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        double EXCHANGE_RATE = 3.23;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String sum = "500.54 BYN";
        Function<String, String> converter = x -> decimalFormat.format((Double.parseDouble(x.split("\\s")[0])
                                                                        / EXCHANGE_RATE)) + " USD";
        System.out.println(converter.apply(sum));
    }
}
