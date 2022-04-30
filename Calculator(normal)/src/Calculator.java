import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField Answer;
	private JButton addition;
	private JButton subtraction;
	private JButton multiplication;
	private JButton division;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 11, 264, 42);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblstNumber = new JLabel("1st Number ");
		lblstNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblstNumber.setBounds(23, 11, 88, 42);
		frame.getContentPane().add(lblstNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 88, 264, 42);
		frame.getContentPane().add(textField_2);
		
		JLabel lblndNumber = new JLabel("2nd Number ");
		lblndNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblndNumber.setBounds(23, 88, 88, 42);
		frame.getContentPane().add(lblndNumber);
		
		Answer = new JTextField();
		Answer.setColumns(10);
		Answer.setBounds(147, 281, 264, 42);
		frame.getContentPane().add(Answer);
		
		addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try
				{
					num1 = Integer.parseInt(textField_1.getText());
					num2 = Integer.parseInt(textField_2.getText());
					
					ans = num1 + num2;
					Answer.setText(Integer.toString(ans));
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Please enter integer number !!!");
				}
			}
		});
		addition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		addition.setBounds(22, 178, 50, 50);
		frame.getContentPane().add(addition);
		
		subtraction = new JButton("-");
		subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int num1, num2, ans;
				try
				{
					num1 = Integer.parseInt(textField_1.getText());
					num2 = Integer.parseInt(textField_2.getText());
					
					ans = num1 - num2;
					Answer.setText(Integer.toString(ans));
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Please enter Integer number !!!");
				}
			}
		});
		subtraction.setFont(new Font("Times New Roman", Font.BOLD, 20));
		subtraction.setBounds(137, 178, 50, 50);
		frame.getContentPane().add(subtraction);
		
		multiplication = new JButton("*");
		multiplication.setFont(new Font("Times New Roman", Font.BOLD, 20));
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int num1, num2, ans;
				try
				{
					num1 = Integer.parseInt(textField_1.getText());
					num2 = Integer.parseInt(textField_2.getText());
					
					ans = num1 * num2;
					Answer.setText(Integer.toString(ans));
				}
				catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null, "Please enter Integer number !!!");
				}
			}
		});
		multiplication.setBounds(249, 178, 50, 50);
		frame.getContentPane().add(multiplication);
		
		division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int num1, num2;
				double ans;
				try
				{
					num1 = Integer.parseInt(textField_1.getText());
					num2 = Integer.parseInt(textField_2.getText());
					
					ans = (double) num1 / num2;
					ans = Math.floor(ans *100000)/100000;
					Answer.setText(Double.toString(ans));
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, "Please enter Integer number !!!");
				}
			}
		});
		division.setFont(new Font("Times New Roman", Font.BOLD, 20));
		division.setBounds(361, 178, 50, 50);
		frame.getContentPane().add(division);
		
		lblAnswer = new JLabel("ANSWER");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAnswer.setBounds(23, 281, 88, 42);
		frame.getContentPane().add(lblAnswer);
	}

}
