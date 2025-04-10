import java.util.Scanner;
public class Ex02
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int num[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter the Integer : ");
			num[i]=ob.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<10;i++)
		{
			System.out.print("The "+(i+1)+" th number is "+num[i]);
			System.out.println();
		}
		System.out.println();

		String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for (String day:days)
		{
			System.out.println(day+"\t");
			
		}
	}
}