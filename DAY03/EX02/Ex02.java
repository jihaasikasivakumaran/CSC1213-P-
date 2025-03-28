import java.util.Scanner;
class Ex02
{
	public static void main(String[] args)
	{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the first Number");
	double num1=ob.nextDouble();
	System.out.print("Enter the Second Number");
	double num2=ob.nextDouble();
	System.out.print("Enter the Third Number");
	double num3=ob.nextDouble();
	 
	 if(num1>num2 && num1>num3)
	 {
		 System.out.print("The Maximum Number is :"+num1);
	 }
	 else if(num2>num1 && num2>num3)
	 {
		 System.out.print("The Maximum Number is :"+num2);
	 }
	 else
	 {
		  System.out.print("The Maximum Number is :"+num3);
	 }
	}
}


	 
	
	