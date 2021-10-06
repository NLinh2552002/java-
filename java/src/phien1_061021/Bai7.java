package phien1_061021;
import java.util.Scanner;
public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,first=0,second=1;
		
		for (int i =0 ; i<=n;++i) {
			System.out.println(first + " ");
			int next = first + second;
			first=second;
			second = next;
		}
	}

}
