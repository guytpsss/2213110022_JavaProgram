import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minute = scan.nextInt();
		int year = minute/365/60/24;
		int day = (minute /60/24)-(year*365);
		System.out.println(minute+" minutes is approximatly "+year+" year and "+day+" days");
	}

}
