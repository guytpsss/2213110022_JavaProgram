import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputStudent();
	}//end main
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String studentID = "";
		String subjectID;
		do {
			System.out.print("Enter Student Id: ");
			studentID = scan.nextLine();
			System.out.print("Enter Subject Id: ");
			subjectID = scan.nextLine();	
		}while(!isLength(studentID,subjectID));	
		boolean ITstudent = isITStudent(studentID);
		boolean ITSubject = isITSubject(subjectID);
		displayData(ITstudent,ITSubject,studentID);
	}//end input
	public static boolean isLength(String sID,String subID) {
		if(sID.equals(7)) return true;
		else if(subID.equals(7)) return true;
		else return false;
	}//end length
	public static boolean isITStudent(String studentID){
		if(studentID.charAt(2)=='1'&&studentID.substring(3,5).equals("311")) return true;
		else return false;
	}
	public static boolean isITSubject(String subjectID) {
			if(subjectID.substring(0,1).equals("21")&&subjectID.charAt(4)=='1') return true;
			else return false;
	}
	public static void displayData(boolean ITstudent,boolean ITSubject,String studentID) {
		if(ITstudent==true&&ITSubject==true) {
			System.out.print("Student id: "+studentID+((ITstudent)?" 1st year student in IT and\nEnrol in courses for Year 1"
					:"is not 1st student in IT and\nEnrol in courses for Year 1"));
		}
	}
}
