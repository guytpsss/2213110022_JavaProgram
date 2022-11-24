import javax.swing.*;
public class Example1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input Full name");
		int birthyear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth year"));
		while (birthyear<1980||birthyear>2018) {
			birthyear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth year"));
		}
		int gender = JOptionPane.showConfirmDialog(null,
				 								 "Are you Female?",
				 								 "Gender",
				 								 JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,"Full name : "+name+"\nBirth Year: "+birthyear+"\nYou're "+(gender==0?"Female":"Male"));
	}

}
