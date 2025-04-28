class Main2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 2020; i <= 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + (i + 1) + " Итого " + total);
        }
        System.out.println(total);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1));
        }
        System.out.println("Задача 2.");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3.");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5.");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println("Задача 6.");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7.");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8.");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += savings;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача 9.");
        total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total += savings;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача 10.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}