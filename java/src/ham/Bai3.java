package ham;

import java.util.Scanner;

public class Bai3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        String s = "asdads"; 
        System.out.println("Enter n: ");
        boolean check = true;
        while (check) {
            n = input.nextInt();
            if (n > 0) {
                check = false;
            } else {
                System.out.println("Nhap lai; ");
            }
        }
        for (int i = 0; i < n; i++) {
            Bai3.Output(s);
        }
    }
    public static void Output(String s) {
        System.out.printf("%S\n", s);
    }
}