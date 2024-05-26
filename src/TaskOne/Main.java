package TaskOne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения:");
        LocalDate dateOfBirthday = LocalDate.parse(scanner.nextLine()).plus(100, ChronoUnit.YEARS);
        System.out.println(dateOfBirthday);
    }
}