package ham;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        boolean check_r = true;
        while (check_r) {
            int n = 0;
            System.out.println("Enter n: ");
            boolean check = true;
            while (check) {
                n = input.nextInt();
                if (n == 1 || n == 2) {
                    check = false;
                } else {
                    System.out.println("nhap lai");
                }
            }
            if (n == 1) {
                float a , b;
                System.out.println("Enter a and b: ");
                a = input.nextFloat();
                b = input.nextFloat();
                Bai7.giaiPt1(a, b);
            } else {
                float a , b, c;
                System.out.println("Enter a, b and c: ");
                a = input.nextFloat();
                b = input.nextFloat();
                c = input.nextFloat();
                Bai7.giaiPt2(a, b, c);
            }
            
            System.out.println("Lap lai? ");
            r = input.nextInt();
            if (r == 0) {
                check_r = false;
            }
            if (r == 1) {
                check_r = true;
            }
        }
        
        
    }
    
    public static void giaiPt1(double a, double b) {
        double x = -b/a;
        if (a == 0) {
            System.out.println("vo nghiem");
        } else {
            System.out.println("x = " + x);
        }
    }  
    
    public static void giaiPt2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo nghiem");
            } else {
                System.out.println("pt co nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("pt co 2 nghiem "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("pt co nghiem kep "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("vo nghiem");
        }
    }
        
}