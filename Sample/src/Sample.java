import java.io.*;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		
		System.out.println("Enter number of array");
		int n =Integer.parseInt(sc.nextLine());

		int arr[]= new int[n]; 
		for (int i=0;i<n;i++)
		{
			arr[i]= Integer.parseInt(sc.nextLine());
			
			
		}
		
		Sample s = new Sample();
		arr = s.Calculate_Max(arr);
		
		System.out.println(arr[1]);
		
	}
	
	public int[] Calculate_Max(int[] arr)
	{
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
				
				
			}
			
			for(int a:arr)
			{
				System.out.println(a);
			}
			System.out.println("---------");
			
			
		}
		
		
		
		
		return arr;
		
		
		
		
		
		
	}

}
