package by.bsuir.java_fundamentals;

import java.util.Scanner;

public class fourth_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int)(Math.random() * ((100 - 1) + 1)) + 1;
        }

        for(int num : nums) {
            System.out.println(num);
        }

        System.out.println();
        int index = 0;
        for(int num : nums) {
            if (isPrime(num)) {
                System.out.println("Number: " + num);
                System.out.println("Index of the prime number: " + index);
                System.out.println("--------------------------------------");
                index++;
            } else {
                index++;
            }
        }
        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
