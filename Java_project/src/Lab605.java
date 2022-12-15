import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[5];
		for(int i = 0;i<number.length;i++) {
			number[i]=Integer.parseInt(JOptionPane.showInputDialog("Input Number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);
	}//end main
	public static void showEven(int[] nums) {
		String evennum = "";
		for(int i = 0 ;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evennum = evennum + nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of even number:\n"+evennum);
	}//end even]
	public static void showOdd(int[] nums) {
		String oddnum = "";
		for(int i = 0 ;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				oddnum = oddnum + nums[i]+" ";
			}
		}	
		 JOptionPane.showMessageDialog(null,"List of odd number:\n"+oddnum);
		 //end odd
    }
}
