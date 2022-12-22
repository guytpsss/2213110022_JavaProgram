import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		System.out.println();
		Product[] ProductL = new Product[size];
		for(int i =0;i<ProductL.length;i++) {
			ProductL[i] = new Product();
			System.out.print("Input product Id	: ");
			ProductL[i].setID(scan.next());
			System.out.print("Input product Unit	: ");
			ProductL[i].setUnit(scan.nextInt());
			while(ProductL[i].getUnit()<0) {
				System.out.print("Input product Unit, again : ");
				ProductL[i].setUnit(scan.nextInt());
			}
			System.out.println();
		}//end for loop
		System.out.println("-------------------------------");
		System.out.println("List of product in \'LOW\' status");
		System.out.println("-------------------------------");
		for(Product PD:ProductL) {
			if(PD.getUnit()<5) System.out.print(">> "+PD.getID()+" has "+PD.getUnit()+" unit ");
		}
		System.out.println("-------------------------------");
		System.out.println("List of product in \'NORMAL\' status");
		System.out.println("-------------------------------");
		for(Product PD:ProductL) {
			if(PD.getUnit()>=50) System.out.print(">> "+PD.getID()+" has "+PD.getUnit()+" unit ");
		}
		System.out.println("-------------------------------");
		System.out.println("List of product in \'HIGH\' status");
		System.out.println("-------------------------------");
		for(Product PD:ProductL) {
			if(PD.getUnit()>50) System.out.print(">> "+PD.getID()+" has "+PD.getUnit()+" unit ");
		}
	}
}
