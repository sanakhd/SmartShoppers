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

public class CustomerProfileView extends JFrame {

	dataBase db = new dataBase();
	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField emailField;
	private JTextField password;
	DefaultTableModel model;
	private JLabel lblNewLabel_1;
	private JButton btnUpdate;
	private JButton btnNewButton_2;
	private final String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//dataBase db = new dataBase();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerProfileView frame = new CustomerProfileView(null);
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
	public CustomerProfileView (String email2) {
		email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(1, 1, 849, 466);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(288, 145, 88, 16);
		panel.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(288, 172, 69, 16);
		panel.add(lblLastName);

		JLabel lblemail = new JLabel("Email:");
		lblemail.setBounds(288, 200, 69, 16);
		panel.add(lblemail);

		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(288, 228, 69, 16);
		panel.add(lblpassword);

		
		dataBase db = new dataBase ();
		String [] user = db.getUserProfile(email);
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(358, 140, 144, 26);
		firstName.setText(user[0]);
		panel.add(firstName);

		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(358, 167, 144, 26);
		lastName.setText(user[1]);
		panel.add(lastName);

		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(358, 195, 144, 26);
		emailField.setText(user[2]);
		panel.add(emailField);

		password = new JTextField();
		password.setColumns(10);
		password.setBounds(358, 223, 144, 26);
		password.setText(user[3]);
		panel.add(password);
		
		lblNewLabel_1 = new JLabel("MY PROFILE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1.setBounds(302, 56, 231, 26);
		panel.add(lblNewLabel_1);

		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String [] updateUser = {firstName.getText(), lastName.getText(), emailField.getText(), password.getText()};
					
					dataBase db = new dataBase ();
					db.updateUserProfile(updateUser);
					JOptionPane.showMessageDialog(null, "Information Updated Succesfully! ");
					CustomerProfileView cpv= new CustomerProfileView (email);
					
				
					
				
				}

			
		});
		btnUpdate.setBounds(385, 307, 86, 29);
		panel.add(btnUpdate);

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
				VirtualShoppingView back = new VirtualShoppingView(email);
				back.setLocationRelativeTo(null);
				back.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(707, 379, 117, 29);
		panel.add(btnNewButton_2);

	}
}
