package Fullclassespackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametext;
	private JPasswordField passwordtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(199, 10, 115, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(38, 85, 115, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(38, 181, 96, 37);
		contentPane.add(lblNewLabel_2);
		
		usernametext = new JTextField();
		usernametext.setBounds(199, 89, 156, 37);
		contentPane.add(usernametext);
		usernametext.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(usernametext.getText().trim().isEmpty() && passwordtext.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Blank not Allowed");
				}
				
				else if(usernametext.getText().equals("Admin") && passwordtext.getText().equals("123")) {
					 
					 JOptionPane.showMessageDialog(btnNewButton, "hello");
					 
					
					 
					 
					
					  
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Username and password do not match");
				}
				
			}});
		btnNewButton.setBounds(128, 264, 106, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(344, 264, 96, 37);
		contentPane.add(btnNewButton_1);
		
		passwordtext = new JPasswordField();
		passwordtext.setBounds(199, 181, 156, 37);
		contentPane.add(passwordtext);
	}
}
