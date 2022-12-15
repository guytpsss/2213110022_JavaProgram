import javax.swing.*;
public class Lab_606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25, 78, 41, 22, 36, 85,37};
		int indexofArray = Integer.parseInt(JOptionPane.showInputDialog("Input idex of array:"));
		while(checkIndex(nums,indexofArray)) {
			 indexofArray =Integer.parseInt(JOptionPane.showInputDialog("Input idex of array, again:"));
		}
		int cur =currentData(nums,indexofArray);
		int previos = prevData(nums,indexofArray);
		int next =nextData(nums,indexofArray);
		JOptionPane.showMessageDialog(null,
				         "Current data,nums["+indexofArray+"] is "+ nums[indexofArray]
						+((previos == 0)?"\nNo previos data " : "\nPrevios data,num ["+(indexofArray-1)+"] is "+nums[indexofArray-1])
						+((next ==  0)?"\nNo next data": "\nNext data,num ["+(indexofArray+1)+"] is "+nums[indexofArray+1]));
		
	}
	public static boolean checkIndex(int[] nums,int index) {
		return (index<0||index>(nums.length-1))?true:false;
	}
	public static int currentData(int[] nums,int index) {
		return (nums[index]);
	}
	public static int prevData(int[] nums,int index) {
		return (index-1<0)?0:nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return (index+1>nums.length-1)?0:nums[index+1];
	}

}
