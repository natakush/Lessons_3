package org.homew3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму в доларах для конвертації: ");
        double amountUsd = scanner.nextDouble();

        double commission = 1.0;
        double exchangeRate = 36.55;

        CurrencyConverter converter = new CurrencyConverter(commission, exchangeRate);

        double totalAmount = converter.calculateTotalAmount(amountUsd);

        System.out.println("Сума до виплати: " + totalAmount + " гривень");
    }
}
