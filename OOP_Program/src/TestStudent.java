import java.util.*;
public class TestStudent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];//defind array of object
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
		System.out.println();
		System.out.println("List OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------------");
		/*for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+" )"+std[i].getScore()+")");
			}
		}*/
		for(Student STD : std) {
			if(STD.isPass()) {
				System.out.println(">> "+STD.getName()+" ("+STD.getScore()+")");
			}
		}
	}

}
