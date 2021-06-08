package logger_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class Logger_system {
	private JFrame frame;
	private JTextField txtUSERNAME;
	private JPasswordField txtPASSWORD;

	//Launching of Application
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logger_system window = new Logger_system();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Creating the application
	public Logger_system() {
		initialize();
	}

	//Initializing the content of the frame
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 552, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKEY_LOG_SYSTEM = new JLabel("KEY LOG SYSTEM");
		lblKEY_LOG_SYSTEM.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblKEY_LOG_SYSTEM.setBounds(120, 50, 287, 52);
		frame.getContentPane().add(lblKEY_LOG_SYSTEM);
		
		JLabel lblUSERNAME = new JLabel("USERNAME");
		lblUSERNAME.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUSERNAME.setBounds(101, 148, 123, 45);
		frame.getContentPane().add(lblUSERNAME);
		
		JLabel lblPASSWORD = new JLabel("PASSWORD");
		lblPASSWORD.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPASSWORD.setBounds(101, 221, 123, 45);
		frame.getContentPane().add(lblPASSWORD);
		
		txtUSERNAME = new JTextField();
		txtUSERNAME.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtUSERNAME.setBackground(Color.WHITE);
		txtUSERNAME.setBounds(250, 158, 194, 32);
		frame.getContentPane().add(txtUSERNAME);
		txtUSERNAME.setColumns(10);
		
		txtPASSWORD = new JPasswordField();
		txtPASSWORD.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtPASSWORD.setBackground(Color.WHITE);
		txtPASSWORD.setBounds(250, 231, 194, 32);
		frame.getContentPane().add(txtPASSWORD);
		
		//Login Button
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String USERNAME = txtUSERNAME.getText();
				String PASSWORD = txtPASSWORD.getText();
				
				if(PASSWORD.contains("igot") && USERNAME.contains("kenith")){
					txtUSERNAME.setText(null);
					txtPASSWORD.setText(null);
					
					//Locating command for a new class which is the key checker
					Key_Checker.main(null);
				}				
				else {
					JOptionPane.showMessageDialog(null,"Invalid Login Username and Password", "Login Error",JOptionPane.ERROR_MESSAGE);
					txtUSERNAME.setText(null);
					txtPASSWORD.setText(null);
				}
		}
		});
		btnLOGIN.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLOGIN.setBackground(SystemColor.activeCaption);
		btnLOGIN.setBounds(153, 317, 89, 32);
		frame.getContentPane().add(btnLOGIN);
		
		//Reset Button
		JButton btnRESET = new JButton("RESET");
		btnRESET.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUSERNAME.setText(null);
				txtPASSWORD.setText(null);
			}
		});
		btnRESET.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRESET.setBackground(SystemColor.activeCaption);
		btnRESET.setBounds(318, 317, 89, 32);
		frame.getContentPane().add(btnRESET);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 292, 456, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 113, 456, 2);
		frame.getContentPane().add(separator_1);
	}
}
