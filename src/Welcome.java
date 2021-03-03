import java.util.Scanner;

public class Welcome {
	static Scanner scanner= new Scanner(System.in); //System.in is a standard input stream.
	
	public static void main(String args[]) {
		String firstName;
		String lastName;
		
		System.out.println("\n********************************");
		System.out.print("Enter Your First Name:  ");
		firstName = scanner.next();
		
		System.out.print("Enter Your Last Name:  ");
		lastName = scanner.next();
		System.out.println("********************************\n");

		String userName = firstName+" "+lastName;
		System.out.println(userName+","+" Welcome to Bugema!");
	}
}
