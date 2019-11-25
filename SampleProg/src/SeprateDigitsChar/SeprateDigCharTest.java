package SeprateDigitsChar;
import java.io.*;

public class SeprateDigCharTest  {

	public static void main(String[] args) throws IOException  {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any sequence");
		String s = br.readLine();
		
		String ans="";
		
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i)))
			{
			ans = ans+s.charAt(i);
				
			if(i%3==0 && i>1)
			{
				ans =ans+"+";
			}
			}
			
			
			
	
			
		}
		System.out.println(ans);
		
	}

}
