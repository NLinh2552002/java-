package bt_chuoi;

import java.util.Scanner;

public class Bt4_tach_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
       
		String[] arStr = chuoi.split(" ");
		for (String item : arStr) {
			System.out.println(item);
		}
        }
	}


