package phien2_061021;
import java.util.Scanner;
public class Bai8 {

	public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
   
    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
         System.out.print("nhap n = ");
        int n = input.nextInt();
        System.out.printf("cac so: ", n);
        int i = 0;
        while (fibonacci(i) < 100) {
            int fi = fibonacci(i);
            if (isPrimeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
    }
    
}