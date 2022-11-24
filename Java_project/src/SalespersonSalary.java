import java.util.Scanner;
import java.text.*;

public class SalespersonSalary {
	final static double COMMISSION_RATE = 0.15;
	final static int SENTINEL = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		int sales;
		double salary;
		while(true) {
			System.out.print("Enter sale in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales==SENTINEL) {
				break;
			}
			salary = 1000+(sales*COMMISSION_RATE);
			System.out.println("Salary is: $"+frm.format(salary)+"\n");		
		}
		System.out.print("bye");
	}

}
