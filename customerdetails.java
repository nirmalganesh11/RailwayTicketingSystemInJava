package Fullclassespackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class customerdetails extends JFrame {n 

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	static String temp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerdetails frame = new customerdetails(temp);
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
	public customerdetails(String temp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField  = new JTextField();
		textField.setBounds(79, 73, 127, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 138, 96, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 195, 108, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(345, 68, 114, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(345, 135, 96, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("AC");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(295, 208, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 76, 69, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 138, 59, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 195, 69, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Amount Paid:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(215, 73, 114, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SeatNumber:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(215, 138, 114, 24);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText(temp);
		textField_5.setBounds(185, 10, 126, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(196, 262, 85, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				  FileWriter fw;
					try {
						fw = new FileWriter("E:\\Dev-Cpp\\java\\Real Build project Rail\\src\\Fullclassespackage\\database.txt");
						String f=textField.getText(); 
					
						fw.write(f);    
				          fw.write(textField_1.getText());
				           fw.write(textField_2.getText());
				        fw.write(textField_3.getText());
				           fw.write(textField_4.getText());
				           fw.write(textField_5.getText());
				           fw.write("Ac="+rdbtnNewRadioButton.getSelectedIcon());
						 
						 
						 
						 fw.close();   
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}    
			       
		
				
			}
		});
		
	
		contentPane.add(btnNewButton);
		
	
		
		
	}
}
