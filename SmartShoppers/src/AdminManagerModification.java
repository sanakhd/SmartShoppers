import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DB.dataBase;
import User.User;

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
import java.sql.*;

public class AdminManagerModification extends JFrame {

	dataBase db = new dataBase();
	private JPanel contentPane;
	private JTextField id;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JTextField password;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel model;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JLabel lblNewLabel_1;
	private JLabel lblStore;
	private JTextField location;
	private JButton btnUpdate;
	private JButton btnLoadData;
	private JButton btnNewButton_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//dataBase db = new dataBase();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminManagerModification frame = new AdminManagerModification();
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
	public AdminManagerModification() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(1, 1, 849, 466);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(35, 94, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(35, 122, 88, 16);
		panel.add(lblFirstName);
	
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(35, 149, 69, 16);
		panel.add(lblLastName);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setBounds(35, 177, 69, 16);
		panel.add(lblemail);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(35, 205, 69, 16);
		panel.add(lblpassword);
		
		id = new JTextField();
		id.setBounds(105, 89, 144, 26);
		panel.add(id);
		id.setColumns(10);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(105, 117, 144, 26);
		panel.add(firstName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(105, 144, 144, 26);
		panel.add(lastName);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(105, 172, 144, 26);
		panel.add(email);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(105, 200, 144, 26);
		panel.add(password);
		
		
		location = new JTextField();
		location.setColumns(10);
		location.setBounds(105, 228, 144, 26);
		panel.add(location);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(261, 81, 582, 265);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		model = new DefaultTableModel();
		Object[] column = {"ID", "First Name", "Last Name", "Email", "Password", "Location"};
		final Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		/*
		 * ==================ADD BUTTON=====================
		 */
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || firstName.getText().equals("") || lastName.getText().equals("") || email.getText().equals("")
						|| password.getText().equals("") || location.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill All Information");
				}else {
					row[0] = id.getText();
					row[1] = firstName.getText();
					row[2] = lastName.getText();
					row[3] = email.getText();
					row[4] = password.getText();
					row[5] = location.getText();
					model.addRow(row);
					User tempUser = new User (row[1]+"", row[2]+"", row[3]+"", row[4]+"");
					db.insertManagerIntoDatabase(tempUser, row[5]+"");
					
					
					id.setText("");
					firstName.setText("");
					lastName.setText("");
					email.setText("");
					password.setText("");
					location.setText("");
					
					
					JOptionPane.showMessageDialog(null, "Added Succesfully! ");
					
					//Manager 
					
				}
				
			}
		});
		btnNewButton.setBounds(35, 274, 86, 29);
		panel.add(btnNewButton);
		
		/*
		 * =============REMOVE BUTTON=========================
		 */
		btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					db.removeManagerIntoDatabase(String.valueOf(model.getValueAt(i, 3)));
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Removed Succesfully! ");
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
			}
		});
		btnRemove.setBounds(150, 274, 86, 29);
		panel.add(btnRemove);
		
		lblNewLabel_1 = new JLabel("Manager Add/Remove");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 40, 231, 26);
		panel.add(lblNewLabel_1);
		
		lblStore = new JLabel("Store:");
		lblStore.setBounds(35, 233, 69, 16);
		panel.add(lblStore);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(firstName.getText(), i, 1);
					model.setValueAt(lastName.getText(), i, 2);
					model.setValueAt(email.getText(), i, 3);
					model.setValueAt(password.getText(), i, 4);
					model.setValueAt(location.getText(), i, 5);
					
					JOptionPane.showMessageDialog(null, "Updated Succesfully! ");
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
				
			}
		});
		btnUpdate.setBounds(35, 315, 86, 29);
		panel.add(btnUpdate);
		
		
		/*
		 * ==================LOAD DATA=======================
		 */
		btnLoadData = new JButton("LOAD DATA");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				model.setRowCount(0);
				Connection tempConnect = db.createConnection("Shoppers.db");
				Statement st = tempConnect.createStatement();
				String sqlCommand = "select * from MANAGER";
				ResultSet rs = st.executeQuery(sqlCommand);
				
					String [] row = new String [6];
					while (rs.next())
					{
						row[0] = String.valueOf(rs.getInt("ID"));
						row[1] = String.valueOf(rs.getString("firstName"));
						row[2] = String.valueOf(rs.getString("lastName"));
						row[3] = String.valueOf(rs.getString("email"));
						row[4] = String.valueOf(rs.getString("password"));
						row[5] = String.valueOf(rs.getString("store"));
						
						 model.addRow(row);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnLoadData.setBounds(150, 315, 86, 29);
		panel.add(btnLoadData);
		
		/*
		 * ==============LOGOUT BUTTON==============
		 */
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage hp = new HomePage();
				hp.setLocationRelativeTo(null);
				hp.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(707, 411, 117, 29);
		panel.add(btnNewButton_1);
		
		/*
		 * ===============BACK BUTTON===============
		 */
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminView adminView = new AdminView();
				adminView.setLocationRelativeTo(null);
				adminView.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(707, 379, 117, 29);
		panel.add(btnNewButton_2);


		
	}
}
