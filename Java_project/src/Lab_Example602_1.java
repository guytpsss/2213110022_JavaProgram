import javax.swing.*;
public class Lab_Example602_1 {
	static int[] validvalue = {101,108,201,213,266,304,311,409,411,412};
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemprice =0;
	static boolean validItem= false;

	public static void main(String[] args) {
		InputItem();
	}
	public static void InputItem() {
		int itemorder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		boolean chk = checkItem(itemorder);
		if(chk) {
			System.out.print("Item "+itemorder+" is "+itemprice);
		}
		else System.out.print("Invalid Item");
	}
	public static boolean checkItem(int _itemorder) {
		for(int i=0;i<validvalue.length;i++) {
			if(_itemorder == validvalue[i]) {
				validItem = true;
				itemprice=price[i];
			}
		}
		return validItem;
	}
	
}
