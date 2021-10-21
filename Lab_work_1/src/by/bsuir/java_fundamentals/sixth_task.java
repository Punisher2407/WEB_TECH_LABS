package by.bsuir.java_fundamentals;

import java.util.ArrayDeque;
import java.util.Scanner;

public class sixth_task {
    public static void main(String[] args) {
        ArrayDeque<Double> stack = new ArrayDeque<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = sc.nextInt();
        double result[][] = new double[N][N];
        double buffer[] = new double[N];

        System.out.println("The matrix: ");
        for (int i = 0; i < N; i++) {
            stack.add(sc.nextDouble());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                buffer[j] = stack.pop();
                result[i][j] = buffer[j];
            }
            stack = prepareStack(buffer, N);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static ArrayDeque<Double> prepareStack(double[] source, int N) {
        double last = source[0];
        ArrayDeque<Double> stack = new ArrayDeque<Double>();
        for (int i = 0; i < N - 1; i++) {
            stack.add(source[i + 1]);
        }
        stack.add(last);
        return stack;
    }
}
