package phien2_061021;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number=0, temp = 1;
		long giaiThua = 1;
        while (temp <= number) {
			giaiThua *= temp;
			temp++;
		}
		
		System.out.println(number + "! = " + giaiThua);
	}
	}


