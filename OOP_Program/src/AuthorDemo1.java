import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name     : ");
		String name = scan.next();
		System.out.print("Input author email    : ");
		String email = scan.next();
		System.out.print("Input author gender   : ");
		char gender = scan.next().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.print("\n"+author.toString());
	}

}
