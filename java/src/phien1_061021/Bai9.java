package phien1_061021;
import java.util.Scanner;
public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        while (n !=0) {
        	int temp = n %10;
        	n= n/10;
        	c++;
        	System.out.println(temp);
        	
        }
        System.out.println();
	}

}
