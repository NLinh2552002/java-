package bt_chuoi;

import java.util.Scanner;

public class Bt5_solanxuathien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mangDem = new int[Character.MAX_VALUE];
		String str;
        Scanner scanner = new Scanner(System.in);
        //remove white spaces
        str = scanner.nextLine();
        for(int i=0;i<str.length();i++){
        mangDem[str.charAt(i)]++;
        }
        for(int i=0;i<mangDem.length;i++){
            if(mangDem[i]!=0){
                System.out.println((char)i + ":" + mangDem[i]);
            }
        }
        
	}

}
