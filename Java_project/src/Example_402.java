import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inemail = JOptionPane.showInputDialog("Input your e-mail:");
		while (inemail.startsWith("@") || inemail.contains(" ")) {
			inemail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		inemail = inemail.toLowerCase();
		
		/*if(inemail.endsWith("@gmail.com")||inemail.endsWith("@hotmail.com")){
		  JOptionPane.showMessageDialog(null, "Your e-mail is "+inemail.toLowerCase());
		  } else { JOptionPane.showMessageDialog(null,
		  "Your e-mail is not hotmail or gmil dot com"); }
		 
		
		  JOptionPane.showMessageDialog(null,inemail.endsWith("@gmail.com")||inemail.endsWith("@hotmail.com")
		                                ?"Your e-mail is "+inemail.toLowerCase()
		  								:"Your e-mail is not hotmail or gmil dot com");*/		 
		boolean checkEmail = inemail.endsWith("@gmail.com") || inemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, 
									 (checkEmail) 
									 ? "Your e-mail is " + inemail.toLowerCase()
									 : "Your e-mail is not hotmail or gmil dot com");
	}
}
