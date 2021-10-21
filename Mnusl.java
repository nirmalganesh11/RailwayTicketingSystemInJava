package Fullclassespackage;

import java.awt.EventQueue;
import  Fullclassespackage.Allclassdetailsinformation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Mnusl {

	private JFrame frame;
	boolean b=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mnusl window = new Mnusl();
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
	public Mnusl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 627, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(46, 26, 496, 69);
		frame.getContentPane().add(panel);
		
		JTextPane txtpnRailwayReservationSystem = new JTextPane();
		txtpnRailwayReservationSystem.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnRailwayReservationSystem.setEditable(false);
		txtpnRailwayReservationSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtpnRailwayReservationSystem.setText("Railway Reservation System");
		panel.add(txtpnRailwayReservationSystem);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FROM", "Vijayawada ", "Hyderabad", "Visakapatnam", "Ongole", "Guntur", "Chittoor", "Chennai", "Nellore", "Kurnool", "Warangal"}));
		comboBox.setBounds(55, 131, 333, 32);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Vijayawada ", "Hyderabad", "Visakapatnam", "Ongole", "Guntur", "Chittoor", "Chennai", "Nellore", "Kurnool", "Warangal"}));
		comboBox_1.setBounds(55, 227, 333, 32);
		frame.getContentPane().add(comboBox_1);
		
		JTextPane txtpnTo = new JTextPane();
		txtpnTo.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnTo.setText("To");
		txtpnTo.setBounds(272, 184, 36, 33);
		frame.getContentPane().add(txtpnTo);
		
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("SuperFast Train");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(415, 184, 192, 41);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
		
		
		
		
		
		
		
		
	
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JCheckBox cb = (JCheckBox) event.getSource();
		        if (cb.isSelected()) {
		       b=true;
		            
		        } else {
		          
		        }
		    }
		});
		

		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allclassdetailsinformation ob=new Allclassdetailsinformation();
				
	
				new Trains(ob.computetrains(String.valueOf(comboBox.getSelectedItem()),String .valueOf(comboBox_1.getSelectedItem()),b));
			}
		});
		btnNewButton.setBounds(241, 289, 85, 32);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
