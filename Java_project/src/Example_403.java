import java.util.*;
public class Example_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")){
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int checkspace = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				checkspace++;		
			}			
		}
		System.out.println("This sentence has "+checkspace+" space");
		System.out.print("This sentence has "+(checkspace)+1+" word");
	}

}
