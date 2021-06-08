package logger_system;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Key_Checker {
	private JFrame frame;
	private JTextField txtNAME_SLOT;
	private JTextField txtKEY_ID_SLOT;
	private JTextField txtDATE_BARROWED_SLOT;
	private JTextField txtDATE_RETURNED_SLOT;
	private JTable table;

//Launching of Application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Key_Checker window = new Key_Checker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Creating of Application
	public Key_Checker() {
		initialize();
			}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 832, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_KEY_CHECKER = new JPanel();
		panel_KEY_CHECKER.setBackground(SystemColor.inactiveCaptionBorder);
		panel_KEY_CHECKER.setBounds(232, 69, 350, 47);
		panel_KEY_CHECKER.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		frame.getContentPane().add(panel_KEY_CHECKER);
		
		JLabel lblMR_KEY_CHECKER = new JLabel("Welcome Back Mr. Key Checker");
		panel_KEY_CHECKER.add(lblMR_KEY_CHECKER);
		lblMR_KEY_CHECKER.setVerticalAlignment(SwingConstants.TOP);
		lblMR_KEY_CHECKER.setBackground(Color.RED);
		lblMR_KEY_CHECKER.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_NAME = new JPanel();
		panel_NAME.setBackground(SystemColor.inactiveCaptionBorder);
		panel_NAME.setBounds(20, 151, 106, 35);
		panel_NAME.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		frame.getContentPane().add(panel_NAME);
		
		JLabel lblNAME = new JLabel("NAME");
		panel_NAME.add(lblNAME);
		lblNAME.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_KEY_ID = new JPanel();
		panel_KEY_ID.setBackground(SystemColor.inactiveCaptionBorder);
		panel_KEY_ID.setBounds(151, 151, 83, 35);
		panel_KEY_ID.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		frame.getContentPane().add(panel_KEY_ID);
		
		JLabel lblKEY_ID = new JLabel("KEY ID");
		panel_KEY_ID.add(lblKEY_ID);
		lblKEY_ID.setVerticalAlignment(SwingConstants.TOP);
		lblKEY_ID.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_DATE_RETURNED = new JPanel();
		panel_DATE_RETURNED.setBackground(SystemColor.inactiveCaptionBorder);
		panel_DATE_RETURNED.setBounds(251, 151, 174, 35);
		panel_DATE_RETURNED.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		frame.getContentPane().add(panel_DATE_RETURNED);
		
		JLabel lblNewLabel = new JLabel("DATE BARROWED");
		panel_DATE_RETURNED.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_DATE_RETURN = new JPanel();
		panel_DATE_RETURN.setBackground(SystemColor.inactiveCaptionBorder);
		panel_DATE_RETURN.setBounds(454, 151, 174, 35);
		panel_DATE_RETURN.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		frame.getContentPane().add(panel_DATE_RETURN);
		
		JLabel lblDATE_RETURNED = new JLabel("DATE RETURNED");
		panel_DATE_RETURN.add(lblDATE_RETURNED);
		lblDATE_RETURNED.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		//Logout Button
		JButton btnLOGOUT = new JButton("LOGOUT");
		btnLOGOUT.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, null, Color.RED));
		btnLOGOUT.setBackground(SystemColor.inactiveCaption);
		btnLOGOUT.setBounds(695, 49, 100, 35);
		btnLOGOUT.addActionListener(new ActionListener()
		{private JFrame frame;
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,  "Confirm if you want to EXIT", "KEY LOG SYSTEM",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnLOGOUT.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnLOGOUT);
		
		txtNAME_SLOT = new JTextField();
		txtNAME_SLOT.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtNAME_SLOT.setBounds(20, 197, 106, 29);
		frame.getContentPane().add(txtNAME_SLOT);
		txtNAME_SLOT.setColumns(10);
		
		txtKEY_ID_SLOT = new JTextField();
		txtKEY_ID_SLOT.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtKEY_ID_SLOT.setBounds(151, 197, 83, 29);
		frame.getContentPane().add(txtKEY_ID_SLOT);
		txtKEY_ID_SLOT.setColumns(10);
		
		txtDATE_BARROWED_SLOT = new JTextField();
		txtDATE_BARROWED_SLOT.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtDATE_BARROWED_SLOT.setBounds(251, 197, 174, 29);
		frame.getContentPane().add(txtDATE_BARROWED_SLOT);
		txtDATE_BARROWED_SLOT.setColumns(10);
		
		txtDATE_RETURNED_SLOT = new JTextField();
		txtDATE_RETURNED_SLOT.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		txtDATE_RETURNED_SLOT.setBounds(454, 197, 174, 29);
		frame.getContentPane().add(txtDATE_RETURNED_SLOT);
		txtDATE_RETURNED_SLOT.setColumns(10);
		  
		//Button ADD INFORMATION
		JButton btnADD = new JButton("ADD");
		btnADD.setBackground(SystemColor.inactiveCaption);
		btnADD.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnADD.setBounds(649, 164, 66, 22);
		frame.getContentPane().add(btnADD);
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if (txtNAME_SLOT.getText().equals("") || txtKEY_ID_SLOT.getText().equals("") || txtDATE_BARROWED_SLOT.getText().equals("") || txtDATE_RETURNED_SLOT.getText().equals(""))
				 {
					JOptionPane.showMessageDialog(null, "Please fill up all the information!");	
					}
				else {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object [] { txtNAME_SLOT.getText(),txtKEY_ID_SLOT.getText(), txtDATE_BARROWED_SLOT.getText(), txtDATE_RETURNED_SLOT.getText()});
					JOptionPane.showMessageDialog(null, "Information saved succesfully");	
				}
			}	
		});
		btnADD.setForeground(Color.BLACK);
		btnADD.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnADD);
		
		//Clear Information Button
		JButton btnCLEAR = new JButton("CLEAR");
		btnCLEAR.setBackground(SystemColor.inactiveCaption);
		btnCLEAR.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnCLEAR.setBounds(725, 164, 70, 22);
		btnCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNAME_SLOT.setText("");
				txtKEY_ID_SLOT.setText("");
				txtDATE_BARROWED_SLOT.setText("");
				txtDATE_RETURNED_SLOT.setText(null);	
			}
		});
		btnCLEAR.setForeground(Color.BLACK);
		btnCLEAR.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnCLEAR);
		
		//Button delete information
		JButton btnDELETE = new JButton("DELETE");
		btnDELETE.setBackground(SystemColor.inactiveCaption);
		btnDELETE.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnDELETE.setBounds(725, 201, 68, 22);
		frame.getContentPane().add(btnDELETE);
		btnDELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() ==1 ) {
					tblModel.removeRow(table.getSelectedRow());
				}
				else {
					if (table.getRowCount() == 0 ) {
						JOptionPane.showMessageDialog(null, "Table is Empty");
					}
					else {
						JOptionPane.showMessageDialog(null, "Please select a single row to delete");
					}
				}
			}
		});
		btnDELETE.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnDELETE.setForeground(Color.BLACK);
		frame.getContentPane().add(btnDELETE);
		
		//Update information Button
		JButton btnUPDATE = new JButton("UPDATE");
		btnUPDATE.setBackground(SystemColor.inactiveCaption);
		btnUPDATE.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLUE, null, null, Color.BLUE));
		btnUPDATE.setBounds(647, 201, 68, 22);
		btnUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
				if (table.getSelectedRowCount() == 1) {
					String Name = txtNAME_SLOT.getText();
					String Key_ID = txtKEY_ID_SLOT.getText();
					String Date_Barrowed = txtDATE_BARROWED_SLOT.getText();
					String Date_Returned = txtDATE_RETURNED_SLOT.getText();
					
					tblModel.setValueAt(Name, table.getSelectedRow(), 0);
					tblModel.setValueAt(Key_ID, table.getSelectedRow(), 1);
					tblModel.setValueAt(Date_Barrowed, table.getSelectedRow(), 2);
					tblModel.setValueAt(Date_Returned, table.getSelectedRow(), 3);
					
					JOptionPane.showMessageDialog(null, "Update Succesfully...");	
				}
				else {
					if (table.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Table is empty");	
					}
					else {
						JOptionPane.showMessageDialog(null, "Please select a single row to update");		
					}
				}
			}
		});
		
		btnUPDATE.setForeground(Color.BLACK);
		btnUPDATE.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnUPDATE);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(SystemColor.inactiveCaption);
		scrollPane_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		scrollPane_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		scrollPane_1.setBounds(80, 277, 642, 175);
		frame.getContentPane().add(scrollPane_1);
		
		//Mouse Handler for Update information
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
				String Name = tblModel.getValueAt(table.getSelectedRow(), 0).toString();
				String Key_ID = tblModel.getValueAt(table.getSelectedRow(), 1).toString();
				String Date_Barrowed = tblModel.getValueAt(table.getSelectedRow(), 2).toString();
				String Date_Returned = tblModel.getValueAt(table.getSelectedRow(), 3).toString();	
				
				txtNAME_SLOT.setText(Name);
				txtKEY_ID_SLOT.setText(Key_ID);
				txtDATE_BARROWED_SLOT.setText(Date_Barrowed);
				txtDATE_RETURNED_SLOT.setText(Date_Returned);
			}
		});
		table.setGridColor(Color.BLUE);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setAlignmentY(Component.TOP_ALIGNMENT);
		table.setModel(new DefaultTableModel( new Object[][] {}, new String[] { "Name", "Key ID", "Date Barrowed", "Date Returned" }
		));
		table.getColumnModel().getColumn(0).setMinWidth(20);
		scrollPane_1.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, null));
		panel.setBounds(302, 23, 194, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblKEY_LOG_SYSTEM = new JLabel("KEY LOG\r \r\nSYSTEM\r\r\n");
		lblKEY_LOG_SYSTEM.setBounds(10, 0, 190, 40);
		panel.add(lblKEY_LOG_SYSTEM);
		lblKEY_LOG_SYSTEM.setBackground(SystemColor.activeCaption);
		lblKEY_LOG_SYSTEM.setBorder(null);
		lblKEY_LOG_SYSTEM.setToolTipText("");
		lblKEY_LOG_SYSTEM.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setBounds(10, 246, 796, 2);
		frame.getContentPane().add(separator_1);
		frame.revalidate();
		frame.setVisible(true);
	}
	protected Object parseInt(String text) {
		return null;
	}
	public JScrollPane getScrollPane_1() {
		return getScrollPane_1();
	}
	public JTable getTable() {
		return table;
	}
}
