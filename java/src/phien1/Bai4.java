package phien1;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();
        int s;
        s = day % 7;
        switch (s) {
            case 0: System.out.print("Monday"); break;
            case 1: System.out.print("Tuesday"); break;
            case 2: System.out.print("Wednesday"); break;
            case 3:  System.out.print("Thursday"); break;
            case 4:  System.out.print("Friday"); break;
            case 5: System.out.print("Saturday"); break;
            case 6: System.out.print("Sunday"); break;
            default: System.out.print("Invalid day range)");
        }
    }
}