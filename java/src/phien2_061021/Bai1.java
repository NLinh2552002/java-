package phien2_061021;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 10;i<=200;i++) {
        	if(i%7==0 &&i%5!=0) {
        		System.out.println(i+" ");
        	}
        }
	}

}
