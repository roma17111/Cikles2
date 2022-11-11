public class Main {
    public static void main(String[] args) {
        int deposit = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + total /100;
            total = total + deposit;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей.");

        }

    }
}