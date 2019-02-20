import java.util.*;

public class h_adding 
{
	//initializing the Scanner or reader 
	static Scanner in = new Scanner(System.in);
	
	//main method
	public static void main(String[] args)
	{
		System.out.println("How many rows of the matrix:");
		int n = in.nextInt();
		System.out.println("How many column of the matrix:");
		int m= in.nextInt();
		
		//declaring the matrix
		
		int[][] array = new int[n][m];
		
		if(n<3 || m<3)
		{
			System.out.println("Not Possible");
			return;
		}
		//taking the value from the user
		else
		{
			System.out.println("Enter the value in the array:");
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				array[i][j]= in.nextInt();
			}
		}
		
		System.out.println("\n\n***********ARRAY************\n");
		
		for(int i=0 ;i<n ;i++)
		{
			for(int j=0 ; j<m; j++)
			{
				System.out.printf("%d   ",array[i][j]);
			}
			System.out.println();
		}
			sumI(array,n,n);
		}
		
	}
	
	
	private static void sumI(int[][] array, int n, int m)
	{
		int high=0,sum = 0;
		
		for(int i=1; i<n-1;i++)
		{
			for(int j=1; j<m-1; j++)
			{
				sum = array[i-1][j-1] + array[i-1][j] + array[i-1][j+1] + array[i][j] + array[i+1][j-1] + array[i+1][j] + array[i+1][j+1];
				
				if(high == 0)
					high=sum;
				
				if(high < sum )
					high = sum;
				
			}
		}
		
		System.out.println("The maximum I sum is "+high);
	}
	
	
}
