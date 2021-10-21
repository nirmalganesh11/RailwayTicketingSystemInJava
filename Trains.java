package Fullclassespackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Trains 
{
	JLabel l1;
	JTextField txtKkk;
	Trains(String temp)
	{
		System.out.println(temp);	
		
		
		String ar[] =temp.split("/");
		
		JFrame f = new JFrame("Train Details");
		f.setSize(500,500);
		JLabel lblNewLabel = new JLabel("The Available Trains are");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 22, 345, 38);
		f.add(lblNewLabel);
		txtKkk = new JTextField();
		txtKkk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtKkk.setText(ar[0]+" - "+ar[1]);
		txtKkk.setEditable(false);
		txtKkk.setBounds(135, 70, 278, 38);
		f.add(txtKkk);
		String tem=ar[0]+" - "+ar[1];
		JButton btnNewButton = new JButton("Details");
		btnNewButton.setBounds(196, 262, 85, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerdetails ob= new customerdetails(tem);
				
				ob.setVisible(true);
			}
		});
		
		
		
	f.add(btnNewButton);
	
	
	
		
		
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
