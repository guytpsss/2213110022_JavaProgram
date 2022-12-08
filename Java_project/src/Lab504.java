import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstname = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+firstname);
	}
	public static String abbreviatName(String fullname) {
		String midname ="";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				midname=(midname+fullname.charAt(i+1)).toUpperCase()+".";
			}
			
		}
		return midname;
	}

}
