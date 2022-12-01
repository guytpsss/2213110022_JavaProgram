import java.util.Scanner;
public class Lab_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		if(message.toLowerCase().indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(message);
		}
	}

}
