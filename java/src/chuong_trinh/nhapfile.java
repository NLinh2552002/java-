package chuong_trinh;
import java.io.*;
import java.util.Scanner;
public class nhapfile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = null;
        String t;
        Scanner scanner = new Scanner(System.in);
		t = scanner.nextLine();
        byte[] a = t.getBytes();
        try{
            file = new FileOutputStream("D://output.txt");
            file.write(a); //ghi mang byte vao file
            System.out.print("Da ghi thanh cong!");
 
        }
        catch (Exception e){
            System.out.print(e);// In lỗi ra màn hình
        }
        finally {
            file.close();//Nếu chương trình lỗi thì đóng file lại
        }
    }
}