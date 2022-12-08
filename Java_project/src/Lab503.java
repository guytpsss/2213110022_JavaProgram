import javax.swing.*;
public class Lab503 {
	static int inputYear;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
		boolean check = checkYear(inputYear);
		System.out.println(check);
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"+"\nInput Year, again"));
		}
		/*if(isLeapYear(inputYear)) JOptionPane.showMessageDialog(null,inputYear+"is Leap Year");
		else JOptionPane.showMessageDialog(null,inputYear+"is not Leap Year");*/
		JOptionPane.showMessageDialog(null,check?inputYear+" is Leap Year"
				                                :inputYear+" is not Leap Year");
	}//end main method
	public static boolean checkYear(int Year) {
		if(Year>=1000&&Year<=3000) return true;
		else return false;
	}
	public static boolean isLeapYear(int lyear) {
		if((lyear%4==0)&&(lyear%100!=0)||(lyear%400==0)) {
			return true;
		}
		else return false;
	}
}
