import java.util.Scanner;
class Ex04
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the letter :");
		char letter=ob.next().charAt(0);
		switch(letter)
		{
			case 'a':
			System.out.print("The letter is Vovel");
			break;
			case 'e':
			System.out.print("The letter is Vovel");
			break;
			case 'i':
			System.out.print("The letter is Vovel");
			break;
			case 'o':
			System.out.print("The letter is Vovel");
			break;
		    case 'u':
			System.out.print("The letter is Vovel");
			break;
			default:
			System.out.print("The letter is  not Vovel");
		}
	}
}