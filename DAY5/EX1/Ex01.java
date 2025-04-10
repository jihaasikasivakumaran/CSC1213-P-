import java.util.Scanner;
public class Ex01
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int sum=0;
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the integer number : ");
			arr[i]=ob.nextInt();
		
			sum+=arr[i];
		}
		
		System.out.print("The sum of Integers :"+sum);
			
		
	}
}
			