import javax.swing.*;
import java.util.*;
public class Lab_Example602_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean deptwasfound =false;
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		String inputDeptName = JOptionPane.showInputDialog("Enter a department name");
		for(int i = 0;i<deptName.length;i++) {
			if(inputDeptName.equalsIgnoreCase(deptName[i])) {
				deptwasfound =true;
			}
		}
		if(deptwasfound) JOptionPane.showMessageDialog(null,inputDeptName+" was found in the list");
		else JOptionPane.showMessageDialog(null,inputDeptName+" was not found in the list");
	}

}
