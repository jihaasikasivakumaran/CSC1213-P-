import java.util.Scanner;
class Ex3 {
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int sum=0;
		char c=' ';
		int even=0;
		int odd=0;
		int sumodd=0;
		int sumeven=0;
		do
		{
			System.out.println("Enter the Number to find the summmation :  ");
			int num=ob.nextInt();
			sum=sum+num;
			System.out.println("Do you want to Continue (Y/N) : ");
			c =ob.next().charAt(0);
			if(num%2==0)
			{
				sumeven=sumeven+num;
				even++;
			}
			else
			{
				sumodd=sumodd+num;
				odd++;
			}
				
		}
		while(c=='y' || c=='Y');
		{
			System.out.println("Summation of the numbers : "+sum);
		}
		System.out.println("Count the Even Numbers of User has Eneterd is : "+even);
		System.out.println("Summation of the Even Numbers of User has Eneterd is : "+sumeven);
		System.out.println("Count the odd Numbers of User has Eneterd is : "+odd);
		System.out.println("Summation of the odd Numbers of User has Eneterd is : "+sumodd);
	}
}	
	