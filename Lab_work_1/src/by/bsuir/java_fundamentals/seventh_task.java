package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class seventh_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = sc.nextInt();
        double source[] = new double[N];

        System.out.println("The matrix: ");
        for (int i = 0; i < N; i++) {
            source[i] = (sc.nextDouble());
        }

        double tmp;
        int i, j, step;
        for (step = N / 2; step > 0; step /= 2) {
            for (i = step; i < N; i++) {
                tmp = source[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < source[j - step])
                        source[j] = source[j - step];
                    else
                        break;
                }
                source[j] = tmp;
            }
        }

        for (i = 0; i < N; i++) {
            System.out.print(source[i]);
            System.out.print(" | ");
        }
        sc.close();
    }
}
