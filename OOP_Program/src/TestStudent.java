import java.util.*;
public class TestStudent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many in classroom : ");
		Student[] std = new Student[scan.nextInt()];//defind array of object
		for(int i =0;i<std.length;i++) {
			std[i] = new Student(); // declare array object,call all of method student()
			System.out.print("Input Studet name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkscore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while
			System.out.println();
		}//end for
		System.out.println("-----------------------------------");
		/*for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+" )"+std[i].getScore()+")");
			}
		}*/
		for(Student STD : std) {
			String grade = findGrade(STD.getScore());
				System.out.println(">> "+STD.getName()+" get grade "+grade);
		}//end loop
	}//end main
	public static String findGrade(int score) {
		if(score >=80 && score <=100) return "A";
		else if(score >=75 && score <=79) return "B+";
		else if(score >=70 && score <=74) return "B";
		else if(score >=65 && score <=69) return "C+";
		else if(score >=60 && score <=64) return "C";
		else if(score >=55 && score <=59) return "D+";
		else if(score >=50 && score <=54) return "D";
		else return "F";
	}
}