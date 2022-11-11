import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int deposit = 15000;
        int total = 0;
        int m = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + m++ + " сумма накоплений равна " + total + " рублей.");
        }

        int a = 0;
        while (a <= 10) {
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.println(a++);

        }
        for (int b = 10; b >= 0; ) {
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.println(b-- + " ");

            int y = 12_000_000;
            for (int year = 1; year <= 10; year++) {
                System.out.println("Год " + year + " численность населения составляет " + y + " человек(ка)");
                y = y + y * 9 / 1000;

            }


        }


    }
}