import java.util.Scanner;
class UserInput{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the firstname :");
		fname = sc.nextLine();
		
		System.out.print("Enter Your LastName :");
		String lname= sc.next();
		
		System.out.print("Enter Your Marks :");
		int marks= sc.nextInt();
		
		System.out.println("Fullname :"+fname+" "+lname+"\n"+"Marks is :"+marks);
	}
}
		
		