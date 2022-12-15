import java.util.*;
public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static double inputscore[] = new double[5];
	static int sum =0;
	static double averagenum =0;
	public static void main(String[] args) {
		for(int i=0;i<inputscore.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			inputscore[i]=scan.nextDouble();
			sum+=inputscore[i];
		}
		System.out.println();
		averagenum =sum/(inputscore.length);
		System.out.println("Average of "+inputscore.length+" student is "+averagenum);
		for(int i=0;i<inputscore.length;i++) {
			if(inputscore[i]>averagenum) {
				System.out.println("> Student "+(i+1)+"("+inputscore[i]+")");
			}
		}
	}

}
