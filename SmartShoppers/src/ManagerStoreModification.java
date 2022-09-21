import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ManagerStoreModification extends JFrame {

	private JPanel contentPane;
	
	Connection connection = null;
	private JTextField id;
	private JTextField openingHours;
	private JTextField closingHours;
	private JTextField location;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel model;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JLabel lblNewLabel_1;
	private JButton btnUpdate;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerStoreModification frame = new ManagerStoreModification();
					frame.setLocationRelativeTo(null);
					frame.setLocationRelativeTo(null);
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
	public ManagerStoreModification() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(1, 1, 794, 466);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(35, 94, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("Opening Hours:");
		lblFirstName.setBounds(35, 122, 118, 16);
		panel.add(lblFirstName);
	
		JLabel lblLastName = new JLabel("Closing Hours:");
		lblLastName.setBounds(35, 149, 108, 16);
		panel.add(lblLastName);
		
		JLabel lblemail = new JLabel("Location:");
		lblemail.setBounds(35, 177, 69, 16);
		panel.add(lblemail);
		
		id = new JTextField();
		id.setBounds(141, 89, 108, 26);
		panel.add(id);
		id.setColumns(10);
		
		openingHours = new JTextField();
		openingHours.setColumns(10);
		openingHours.setBounds(141, 117, 108, 26);
		panel.add(openingHours);
		
		closingHours = new JTextField();
		closingHours.setColumns(10);
		closingHours.setBounds(141, 144, 108, 26);
		panel.add(closingHours);
		
		location = new JTextField();
		location.setColumns(10);
		location.setBounds(141, 177, 108, 26);
		panel.add(location);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(261, 81, 514, 265);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		model = new DefaultTableModel();
		Object[] column = {"ID", "Opening Hours", "Closing Hours", "Location"};
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		/*
		 * ==================ADDD BUTTON================
		 */
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || openingHours.getText().equals("") || closingHours.getText().equals("") || location.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill All Information");
				}else {
					row[0] = id.getText();
					row[1] = openingHours.getText();
					row[2] = closingHours.getText();
					row[3] = location.getText();
					model.addRow(row);
					
					id.setText("");
					openingHours.setText("");
					closingHours.setText("");
					location.setText("");
					
					JOptionPane.showMessageDialog(null, "Added Succesfully! ");
					
					
				}
				
			}
		});
		btnNewButton.setBounds(35, 234, 86, 29);
		panel.add(btnNewButton);
		
		/*
		 * ===============REMOVE BUTTON================
		 */
		btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Removed Succesfully! ");
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
			}
		});
		btnRemove.setBounds(141, 234, 86, 29);
		panel.add(btnRemove);
		
		lblNewLabel_1 = new JLabel("Store Management\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 40, 231, 26);
		panel.add(lblNewLabel_1);
		
		/*
		 * ===========UPDATE BUTTON============
		 */
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(openingHours.getText(), i, 1);
					model.setValueAt(closingHours.getText(), i, 2);
					model.setValueAt(location.getText(), i, 3);
					
					JOptionPane.showMessageDialog(null, "Updated Succesfully! ");
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
				
			}
		});
		btnUpdate.setBounds(92, 281, 86, 29);
		panel.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManagerView mv = new ManagerView();
				mv.setLocationRelativeTo(null);
				mv.setVisible(true);
				
			}
		});
		btnBack.setBounds(670, 386, 86, 29);
		panel.add(btnBack);
		
		JButton btnUpdate_1_1 = new JButton("Log Out");
		btnUpdate_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage mv = new HomePage();
				mv.setLocationRelativeTo(null);
				mv.setVisible(true);
			}
		});
		btnUpdate_1_1.setBounds(670, 427, 86, 29);
		panel.add(btnUpdate_1_1);

		
	}
}
