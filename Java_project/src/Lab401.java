import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int checkspace = fullName.indexOf(' ');
		if(checkspace==-1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstName=fullName.substring(0,checkspace);
			String lastNmae=fullName.substring(checkspace+1);
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Lsst Name: "+lastNmae.toLowerCase());
		}
	}
}
