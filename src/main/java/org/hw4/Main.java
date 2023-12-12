package org.hw4;
public class Main {
    public static void main(String[] args) {
        int rows = 9;

        System.out.println("Трикутник:");
        for (int i = 0; i < rows/2+1; i++) {
            int k = rows/2 - i;
            while (k > 0) {
                System.out.print("  ");
                k--;
            }
            for (int j = 0; j <= i*2; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}