import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
    int num1, num2, ansInt;
    double ansDouble;
	String operation;
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
		frame.setBounds(100, 100, 301, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField.setBounds(10, 11, 265, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC_1 = new JButton("c");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnC_1.setForeground(Color.WHITE);
		btnC_1.setBackground(Color.RED);
		btnC_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnC_1.setBounds(214, 91, 50, 39);
		frame.getContentPane().add(btnC_1);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_3.getText();
				textField.setText(inpute);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_3.setBounds(10, 157, 50, 39);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_4.getText();
				textField.setText(inpute);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_4.setBounds(80, 157, 50, 39);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_5.getText();
				textField.setText(inpute);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_5.setBounds(147, 157, 50, 39);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Integer.parseInt(textField.getText());
				textField.setText(" ");
				operation = " / ";
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_6.setBounds(214, 157, 50, 39);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_7.getText();
				textField.setText(inpute);
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_7.setBounds(10, 227, 50, 39);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_8.getText();
				textField.setText(inpute);
			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_8.setBounds(80, 227, 50, 39);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_9.getText();
				textField.setText(inpute);
			}
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_9.setBounds(147, 227, 50, 39);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Integer.parseInt(textField.getText());
				textField.setText(" ");
				operation = " * ";
			}
		});
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_10.setBounds(214, 227, 50, 39);
		frame.getContentPane().add(button_10);
		
		JButton button_23 = new JButton(".");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_23.getText();
				textField.setText(inpute);
			}
		});
		button_23.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_23.setBounds(10, 367, 50, 39);
		frame.getContentPane().add(button_23);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String inpute = textField.getText() + button_12.getText();
				textField.setText(inpute);
			}
		});
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_12.setBounds(80, 367, 50, 39);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				num2 = Integer.parseInt(textField.getText());
				switch (operation)
				{
				case " + ":
					ansInt = num1 + num2;
					//JOptionPane.showMessageDialog(null, ansInt);
					textField.setText(Integer.toString(ansInt));
					break;
				case " - ":
					ansInt = num1 - num2;
					JOptionPane.showMessageDialog(null, ansInt);
					textField.setText(Integer.toString(ansInt));
					break;
				case " * ":
					ansInt = num1 * num2;
					textField.setText(Integer.toString(ansInt));
					break;
				case " / ":
					ansDouble = (double) num1 / num2;
					textField.setText(Double.toString(ansDouble));
					break;
				}
				
			}
		});
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_13.setBounds(147, 367, 50, 39);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Integer.parseInt(textField.getText());
				textField.setText(" ");
				operation = " - ";
			}
		});
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_14.setBounds(214, 297, 50, 39);
		frame.getContentPane().add(button_14);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String inpute = textField.getText() + button.getText();
				textField.setText(inpute);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button.setBounds(10, 301, 50, 39);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_1.getText();
				textField.setText(inpute);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_1.setBounds(80, 301, 50, 39);
		frame.getContentPane().add(button_1);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String inpute = textField.getText() + button_11.getText();
				textField.setText(inpute);
			}
		});
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_11.setBounds(147, 301, 50, 39);
		frame.getContentPane().add(button_11);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) 
			{
				num1 = Integer.parseInt(textField.getText());
				textField.setText("");
				operation = " + ";		
			}
		});
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_15.setBounds(214, 367, 50, 39);
		frame.getContentPane().add(button_15);
		
		JButton button_2 = new JButton("<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button_2.setBounds(147, 91, 50, 39);
		frame.getContentPane().add(button_2);
	}
}
