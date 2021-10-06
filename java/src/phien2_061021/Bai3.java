package phien2_061021;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
		        int dem = in.nextInt();
		        int n1=0,n2=1;
		        for(int i = 1; i<=dem ; ++i) {
		        	System.out.print(n1+" ");
		        	int sum = n1+n2;
		        	n1=n2;
		        	n2=sum;
		        	}
		        
		       
		        
		}
}

