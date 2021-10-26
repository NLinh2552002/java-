package bt_chuoi;

import java.util.Scanner;

public class Bt7_stringdao {

	public static void main(String[] args) {
		String chuoi;
        Scanner scanner = new Scanner(System.in);
        //remove white spaces
        chuoi = scanner.nextLine();
		
        StringBuffer stringBuffer = new StringBuffer(chuoi);
        System.out.println(stringBuffer.reverse().toString());
	   }

}
