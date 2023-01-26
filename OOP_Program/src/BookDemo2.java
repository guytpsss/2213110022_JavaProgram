import javax.swing.JOptionPane;
public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page  = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int check = JOptionPane.showConfirmDialog(null,"Is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		Book1 book = new Book1(title,new Author1(name,email),page) ;
		if(check==1) {
			page  = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:"));
			JOptionPane.showMessageDialog(null,"Book title : "+book.getTitle()
												+"\n Author name : "+book.getAuthor().getName()+" ("+page+" page)"
												+"\n Author e-mail : "+book.getAuthor().getEmail(),"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null,"Book title : "+book.getTitle()
												+"\n Author name : "+book.getAuthor().getName()+" ("+book.getPage()+" page)"
												+"\n Author e-mail : "+book.getAuthor().getEmail(),"Message",JOptionPane.INFORMATION_MESSAGE);
	}

}
