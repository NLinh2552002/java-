package phien2_061021;
import java.util.Scanner;
public class Bai6 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        System.out.println("liet ke:");
	        for (int i = 10001; i < 99999; i+=2) {
	            if (isPrimeNumber(i)) {
	                System.out.println(i);
	                
	            }
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
	}