import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int deposit = 15000;
        int total = 0;
        for (int m =1; total <=2459000; m++)
        {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей.");

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
            System.out.println(b-- + " ");        }


        int y = 12_000_000;
            for (int year = 1; year <= 10; year++) {
                System.out.println("Год " + year + " численность населения составляет " + y + " человек(ка)");
                y = y + y * 9 / 1000;

            }
                // задание 2.1.//
            int dep = 15000;
            int month = 1;
            while (dep <12_000_000) {
                System.out.println("Месяц " + month++ + "Сумма накоплений" + dep);
                dep = dep + dep / 100 * 7;
            }
            // На сотом месяце сумма накоплений привысит 12_000_000//




    }
}