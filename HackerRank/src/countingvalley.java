import java.util.*;

public class countingvalley 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the Steps:");
		String s = in.nextLine();
		int valley =0;
		int count =0;
		
		s=s.toUpperCase();
		char steps[] = s.toCharArray();
		
		for(int i = 0 ; i<s.length(); i++)
		{
			if(steps[i]=='U')
				count++;
			if(steps[i]=='D')
				count--;
			if(count < 0)
			{
				if(count == -1 && steps[i]=='U')
					continue;
				if(count == -1 && steps[i]=='D')
					valley++;
				
			}
			
		}
		System.out.println("Valley = "+valley);
	}

}
