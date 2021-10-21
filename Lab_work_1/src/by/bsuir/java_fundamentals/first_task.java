package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = sc.nextInt();
        System.out.print("Input y: ");
        int y = sc.nextInt();

        float numerator   = 0;
        float denominator = 0;
        float result      = 0;

        numerator   = (float)(1 + Math.pow(Math.sin(x + y), 2));
        denominator = (float)(2 + Math.abs(x - ((2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2)))));
        result      = (numerator / denominator) + x;

        System.out.println("Numerator: " + numerator);
        System.out.println("Denominator: " + denominator);
        System.out.println("Result: " + result);

        sc.close();
    }
}
