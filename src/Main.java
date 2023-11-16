import java.util.Scanner;
import java.util.Locale;
/*
Operators Logical
--------------------

Доходи оподатковуются за прогресивною шкалою оподаткування:
- від 0 до 10000, включно, за ставкою 2,5%.
- від 10000, виключно, до 25000, включно, за ставкою 4,3%.
- більше 25000, за ставкою 6,7%.

Необхідно розрахувати суму податку від певної суми доходу.
Сума податку дорівнює відсотку від суми доходу.
Забезпечте виведення результату розрахунків з двома знаками
після десяткового роздільника.
 */
    public class Main {
    static double income;
    static double tax;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.ENGLISH);

            System.out.println("Input income quantity: ");
            income = Double.parseDouble(scanner.nextLine());

            if (income >= 0 && income <= 10000) {
                tax = income * 0.025;

            } else if (income > 10000 && income <= 25000) {
                tax = income * 0.043;

            } else if (income > 25000) {
                tax = income * 0.067;

            } else {
                System.out.println("The entered value is incorrect");
                return;
            }

            System.out.printf("Tax quantity: %.2f%n", tax);
        }
    }
