import java.util.Scanner;
public class Ex03
{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		int num[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the Integer number : ");
			num[i]=ob.nextInt();
		}
		int max=num[0];
		int min=num[0];
		for(int i=0;i<5;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("The largest Number is "+max);
		System.out.println("The lowest Number is "+min);
	}
}

		