package chuong_trinh_user;
import java.util.Scanner;
public class Chuvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double PI = 3.14;
		double s;
		Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh r: ");
        r = scanner.nextDouble();
        s=2*r*PI;
        System.out.println("chu vi hinh tron la: "+s);
	}

}