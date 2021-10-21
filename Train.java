package Fullclassespackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Train extends JFrame {


	private JTextField txtKkk;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Train(String temp) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 448);
		
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		frame.setLayout(null);
		
	
		contentPane.add(lblNewLabel);
		
		
		contentPane.add(txtKkk);
		txtKkk.setColumns(10);
	}
}
