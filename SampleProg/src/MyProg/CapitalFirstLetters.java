package MyProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CapitalFirstLetters {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		System.out.println("Enter Strings");
 		String input=br.readLine();
 		
 		String a[]=input.split(" ");
 		
 		for(int i=0;i<a.length;i++)
 		{
 			char[] temp =a[i].toCharArray(); 
 			String t = Character.toString(temp[0]);
 			temp[0]=t.toUpperCase().charAt(0);
 			a[i]= new String(temp);
 		
 			
 		}
		
 		for(String s:a)
 		{
 			System.out.print(s+" ");
 		}

	}

}
