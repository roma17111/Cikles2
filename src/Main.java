import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int deposit = 15000;
        int total = 0;
        for (int m = 1; total <= 2459000; m++) {
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
            System.out.println(b-- + " ");
        }


        int y = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            System.out.println("Год " + year + " численность населения составляет " + y + " человек(ка)");
            y = y + y * 9 / 1000;

        }
        // задание 2.1. 2.2//
        int dep = 15000;
        int month = 1;
        for (; dep < 12_000_000; month++) {
             dep = dep + dep / 100 * 7;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + "Сумма накоплений" + dep);
            }
        }
        // На сотом месяце сумма накоплений привысит 12_000_000//

        int vasyaDep = 15000;
        int aMonth = 1;
        int allMonth = 9*12;
        for (; aMonth <= allMonth; aMonth++) {
            vasyaDep = vasyaDep + vasyaDep /100 *7;
            if (aMonth % 6 ==0) {
                System.out.println("В " + aMonth + " месяце сумма у Васи будет " + vasyaDep + " рубля(лей)");
            }

        }

        int friday = 3;
        for (; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        int astroYear = 0;
        for (;astroYear <=2122; astroYear +=79) {
            if (astroYear >= 1822) {System.out.println(astroYear);}
        }




    }
}