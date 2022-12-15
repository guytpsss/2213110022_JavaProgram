import java.util.*;
public class Lab_Example_603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number[] = new int[5];
		for(int i = 0;i<number.length;i++) {
			System.out.print("Input number"+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		//int totalNum = sumofPos(number);
		//System.out.print("Summation of positive number is "+totalNum);
		System.out.print("Summation of positive number is "+sumofPos(number));
	}
	public static int sumofPos(int[] num) {
		int sum=0;
		for(int n : num) {
			sum+=n;
		}
		return sum;
	}

}
