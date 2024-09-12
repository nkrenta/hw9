import java.util.Scanner;

public class Hw9 {

    public static int scanner() {
        Scanner input = new Scanner(System.in);
        //System.out.println(text);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int totalAmount = 0;
        int[] paymentsByMonth = new int[5];
        for (int i = 0; i < paymentsByMonth.length; i++) {
            System.out.println("Payment number " + (i + 1) + ": ");
            paymentsByMonth[i] = scanner();
        }
        for (int payment : paymentsByMonth) {
            totalAmount += payment;
        }

        System.out.println("Сумма трат за месяц составила " + totalAmount + " рублей.");

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        int minAmount = 5000000;
        int maxAmount = 0;

        int[] paymentsByWeek1 = new int[5];
        for (int i = 0; i < paymentsByWeek1.length; i++) {
            System.out.println("Payment number " + (i + 1) + ": ");
            paymentsByWeek1[i] = scanner();
        }

        for (int payment : paymentsByWeek1) {
            if (payment < minAmount) {
                minAmount = payment;
            }
            if (payment > maxAmount) {
                maxAmount = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей.");

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        double averageAmount = 0;

        int[] paymentsByMonth2 = new int[5];
        for (int i = 0; i < paymentsByMonth2.length; i++) {
            System.out.println("Payment number " + (i + 1) + ": ");
            paymentsByMonth2[i] = scanner();
        }
        for (int payment : paymentsByMonth2) {
            averageAmount += payment;
        }
        averageAmount /= paymentsByMonth2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }
    }
}
