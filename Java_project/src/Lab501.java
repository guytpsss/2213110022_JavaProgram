
public class Lab501 {

	public static void main(String[] args) {
		//string format
		System.out.println(fomatNumber(500));
		System.out.println(fomatNumber('a'));
		System.out.println(fomatNumber(89.9334));
		System.out.println(formatNumber("550"));
	}
	//overloading method
	private static String fomatNumber(int value) {
		return String.format("%d",value);
	}
	private static String fomatNumber(double value) {
		return String.format("%.3f",value);
	}
	private static String formatNumber(String value) {
		return String.format("%.2f",Double.parseDouble(value));
	}
}
