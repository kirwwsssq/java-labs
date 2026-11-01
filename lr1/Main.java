package lr1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите номер:");
        int t = scanner.nextInt();
        switch (t) {
            case 1:
                System.out.println("Вычислить площадь круга по введенному радиусу (S = PI * R^2).");
                System.out.println("Введите R:");
                double R = scanner.nextDouble();
                double S = Math.PI * R * R;
                System.out.println("Результат:" + S);
                break;
            case 2:
                System.out.println("Проверить, существует ли треугольник с заданными сторонами\n" +
                        "(сумма двух сторон > третьей).");
                double a, b, c;
                do {
                    System.out.println("введите сторону a:");
                    a = scanner.nextDouble();
                    System.out.println("введите сторону b:");
                    b = scanner.nextDouble();
                    System.out.println("введите сторону c:");
                    c = scanner.nextDouble();
                }
                while (a > 0 && b > 0 && c > 0);
                if ((a + b > c) && (a + c > b) && (b + c > a)) {
                    System.out.println("Треугольник со сторонами:" + a + "," + b + "," + c + "существует");
                } else {
                    System.out.println("Треугольника нет");
                }
                break;
            case 3:
                System.out.println("Ввести число. Вывести его перевернутый вариант (например, 12345\n" +
                        "-> 54321).");
                System.out.println("введите число");
                int num = scanner.nextInt();
                int k = 0;
                do {
                    int digit = num % 10;
                    k = k * 10 + digit;
                    num = num / 10;
                } while (num != 0);
                System.out.println("перевернутый вариант:" + k);
                break;
            default:
                System.out.println("error");
                break;
        }
        scanner.close();
    }
}