import javax.swing.JOptionPane;
import java.text.*;
public class MusicWorldApp {

	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order"+"\n Please enter the ID of  the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Plese enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Plese enter the quantity to be purchesd"));
		double cdSubtotal = cdPrice * cdQuantity;
		double cdTotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,
									  "Summary of the  transaction:"
									  + "\n\nCD ID: "+cdId
									  +"\nCD Title: "+cdTitle
									  +"\nCD Unit Price: $"+cdPrice
									  +"\nCD Quantity: "+cdQuantity
									  +"\n\nSubtotal: $"+cdSubtotal
									  +"\nTax rate: "+TAX_RATE*100+"%"
									  +"\nTotal: $"+cdTotal
									  +"\n\nEnd of Program");
	}

}
