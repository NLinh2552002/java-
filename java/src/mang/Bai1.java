package mang;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
        int[] a = new int[5];
        Bai1.getValues(a);
        float avg = Bai1.Average(a);
        System.out.print("Average of above Array: " + avg);
    }
   
    public static void getValues(int[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        
    }
    
    public static float Average(int[] a) {
        float avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= (float)(a.length);
        return avg;
    }

}
