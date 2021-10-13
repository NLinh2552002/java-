package ham;

import java.util.Scanner;

public class Bai4 {
    public static double giaiPt1(double a, double b){
        return (-b)/a ;};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        System.out.println("Enter b: ");
        double b = scan.nextDouble();
        double x = giaiPt1(a,b);
        System.out.println(x);   
    }
}
