package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class fifth_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = sc.nextInt();
        int source[] = new int[N];

        System.out.println("The matrix: ");
        for (int i = 0; i < N; i++) {
            source[i] = sc.nextInt();
        }
        System.out.print("K: ");
        System.out.println(numbersCounter(source));
        sc.close();
    }

    public static int numbersCounter(int[] numbers) {
        int result = 0, max = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= max) {
                result++;
            } else {
                max = numbers[i + 1];
            }
        }
        return result;
    }
}
