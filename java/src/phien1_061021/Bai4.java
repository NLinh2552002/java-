package phien1_061021;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s=0;
        int t;
        while(n!=0){
            t = n % 10;
            s += t;
            n /= 10;
	}
        System.out.print("tong la: "+s);
}
	}
