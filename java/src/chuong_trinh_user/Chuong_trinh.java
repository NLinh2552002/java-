package chuong_trinh_user;
import java.util.Scanner;
public class Chuong_trinh {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username, password;
		
		System.out.print("Nhap username: ");
		username = input.nextLine();
		
		System.out.print("Nhap password: ");
		password = input.nextLine();	
		if(username.equals("HuyHoang") && password.equals("2021")) {
			System.out.println("Nhap dung.");
		}else {
			System.out.println("Nhap sai.");
		}
	}

}
