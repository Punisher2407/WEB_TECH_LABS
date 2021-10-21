package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = sc.nextFloat();
        System.out.print("Input b: ");
        float b = sc.nextFloat();
        System.out.print("Input the step, h: ");
        float h = sc.nextFloat();
        System.out.println("-----------------------");


        for(; a <= b; a += h){
            System.out.printf("x = %.02f | F(x) = %f", a, Math.tan(a));
            System.out.println();
        }

        sc.close();
    }
}
