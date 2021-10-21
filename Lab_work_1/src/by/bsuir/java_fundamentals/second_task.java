package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = sc.nextInt();
        System.out.print("Input y: ");
        int y = sc.nextInt();

        System.out.println(checkTheDot(x, y));

        sc.close();
    }

    public static boolean checkTheDot(int x, int y) {
        if ((x >= -4 && x <= 4) && (y >= -3 && y <= 5)){
            return true;
        } else {
            return false;
        }

    }
}
