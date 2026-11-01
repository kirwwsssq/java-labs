package lr2;

import java.util.Scanner;

public class lr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите номер:");
        int t = scanner.nextInt();
        switch (t) {
            case 1:
                int[] arr = new int[10];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = (int) (Math.random() * 100) + 1;
                }
                System.out.println("массив:");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("ввндите x:");
                int x = scanner.nextInt();
                int index = 0;
                boolean f = false;
                while (index < arr.length) {
                    if (arr[index] == x) {
                        f = true;
                        break;
                    }
                    index++;
                }
                if (f) {
                    System.out.println("число найдено");
                } else {
                    System.out.println("число не найдено");
                }
                break;

            case 2:
                int[][] matrix = {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8},
                };


                int n = matrix.length;
                int sum = 0;
                boolean fn = true;
                for (int j = 0; j < n; j++) {
                    sum += matrix[0][j];
                }
                for (int i = 0; i < n; i++) {
                    int summ = 0;
                    for (int j = 0; j < n; j++) {
                        summ += matrix[i][j];
                    }
                    if (summ != sum) {
                        fn = false;
                        break;
                    }

                }
                if (fn) {
                    for (int j = 0; j < n; j++) {
                        int summ = 0;
                        for (int i = 0; i < n; i++) {
                            summ += matrix[i][j];
                        }
                        if (summ != sum) {
                            fn = false;
                            break;
                        }
                    }
                    if (fn) {
                        int summ = 0;
                        for (int i = 0; i < n; i++) {
                            summ += matrix[i][n - 1 - i];
                        }
                        if (summ != sum) {
                            fn = false;
                        }
                    }
                    if (fn) {
                        System.out.println("это магический квадрат");
                    } else {
                        System.out.println("это не магический квадрат");
                    }

                }
                break;
            default:
                System.out.println("error");
                break;
        }
        scanner.close();
    }
}