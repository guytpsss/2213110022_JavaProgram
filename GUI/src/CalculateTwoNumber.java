import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(43, 28, 89, 19);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(163, 27, 130, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(43, 58, 92, 14);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(163, 55, 130, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(298, 266, 99, 19);
		contentPane.add(lblResult);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(43, 93, 70, 14);
		contentPane.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(163, 91, 55, 19);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);

		final JRadioButton OneDigit = new JRadioButton("1 Digit");
		OneDigit.setBounds(163, 128, 109, 23);
		contentPane.add(OneDigit);
		
		final JRadioButton TwoDigit = new JRadioButton("2 Digit");
		TwoDigit.setBounds(163, 154, 109, 23);
		contentPane.add(TwoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(OneDigit);
		group.add(TwoDigit);

		final JCheckBox chkDialogBox = new JCheckBox("Show result dialog box");
		chkDialogBox.setBounds(163, 193, 142, 23);
		contentPane.add(chkDialogBox);
		
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					//JRadioBotton
					DecimalFormat frmNumber = null;
					if(OneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(TwoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText(frmNumber.format(sum));
					
					//JcheckBox
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
					
				}
			}
		});
		btnOK.setBounds(129, 331, 89, 23);
		contentPane.add(btnOK);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(235, 331, 89, 23);
		contentPane.add(btnExit);
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(43, 132, 92, 14);
		contentPane.add(rdbOperator);
		
		JLabel lblNewLabel = new JLabel("Option to show");
		lblNewLabel.setBounds(43, 197, 89, 14);
		contentPane.add(lblNewLabel);
		

	}
}