package bt_chuoi;
import java.util.Scanner;
public class Bt1_xoatatcacackitutrang {
	
	    public static void main(String args[]) {
	        String chuoi;
	        Scanner scanner = new Scanner(System.in);
	        //remove white spaces
	        chuoi = scanner.nextLine();
	        String str2 = chuoi.replaceAll(" ", "");
	        System.out.println(str2);
	    }
	}


