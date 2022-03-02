import java.util.Scanner;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Value For Prime Number");
		int start=sc.nextInt();
		System.out.println("Enter End Value ");
		int end=sc.nextInt();
		int count=0;
		
		
		if(start>=end)
		{
			int num=start;
			 start=end;
			 end=num;
		}
		while(start<end)
	{
		int i=2;
		
		
		while(start>i)
		{
			if(start%i==0)
			{
				break;
			}
			i++;
		}
		if(i==start)
		{
			System.out.println("Number Is Prime Number "+i);
			count++;
		}
		
		start++;
		
	}
		System.out.println(count);

		
	}
}

