package phien1_061021;
import java.util.Scanner;
public class Bai8 {

	public static void main(String[] args) {
		int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long g = 1;
        int i = 1;
        while(i<=number)
        {
            g = g * i;
            i++;
        }
        System.out.println("Giai thua "+number+" là: "+g);

    }
}
