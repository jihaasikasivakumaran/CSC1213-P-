import java.util.Scanner;
class Ex2 {
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int sum=0;
		char c=' ';
		do
		{
			System.out.println("Enter the Number to find the summmation :  ");
			int num=ob.nextInt();
			sum=sum+num;
			System.out.println("Do you want to Continue (Y/N) : ");
			c =ob.next().charAt(0);
		}
		while(c=='y' || c=='Y');
		{
			System.out.println("Summation of the numbers : "+sum);
		}
	}
}	
			

