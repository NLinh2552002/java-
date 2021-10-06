package phien1_061021;
import java.util.Scanner;
public class Bai6 {

	 {
	        int i =0;
	        int num =0;
	        //Empty String
	        String  primeNumbers = "";
	        for (i = 1; i <= 100; i++)
	        {
	            int counter=0;
	            for(num =i; num>=1; num--)
	            {
	                if(i%num==0)
	                {
	                    counter = counter + 1;
	                }
	            }
	            if (counter ==2)
	            {
	                
	                primeNumbers = primeNumbers + i + " ";
	            }
	        }
	        
	        System.out.println(primeNumbers);
	    }
	 }