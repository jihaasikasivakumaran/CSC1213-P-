import java.util.Scanner;
class Ex01{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the Number :");
		Double num1=ob.nextDouble();
		if(num1>0)
		{
			System.out.print("The Number is possitive");
		}
		else if(num1<0)
		{
			System.out.print("The Number is Negative");
		}
		else
		{
			System.out.print("The Number is Zero");
		}
	}
}
	
		