import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] author = new Author[4];
		Scanner scan = new Scanner(System.in);
		for(int i =1;i<=4;i++) {
			System.out.println("Information Author "+i);
			System.out.println("----------------------------------------");
			System.out.print("Input author name  :");
			String name = scan.next();
			System.out.print("Input autor email  :");
			String email = scan.next();
			System.out.println("----------------------------------------");
		}//end for loop
	}

}
