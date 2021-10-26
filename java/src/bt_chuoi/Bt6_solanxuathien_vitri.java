package bt_chuoi;
import java.util.Scanner;


public class Bt6_solanxuathien_vitri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
		int count = 0;
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
        String kytu;
		
        Scanner scanner1 = new Scanner(System.in);
        kytu = scanner1.nextLine();
        for (int i = 0; i < chuoi.length(); i++) 
        	{
        	for (int j = 0; j < kytu.length(); j++)
    		if (chuoi.charAt(i) == kytu.charAt(j)) {
    			count++;
    		}
    	}
    		
    	System.out.println("so lan " + kytu +
    		" trong chuoi " + chuoi + " = " + count);
		 
		
		  
	

}
}
