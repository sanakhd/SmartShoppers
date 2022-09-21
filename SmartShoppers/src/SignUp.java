import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.dataBase;
import User.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JPasswordField password;
	dataBase db = new dataBase();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(374, 0, 433, 490);
		contentPane.add(panel);
		ImageIcon cropTeeImage = new ImageIcon(this.getClass().getResource("/background.jpeg").getFile());
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME");
		lblNewLabel_1.setBounds(31, 99, 96, 16);
		panel.add(lblNewLabel_1);
		
		firstName = new JTextField();
		firstName.setBackground(new Color(119, 136, 153));
		firstName.setForeground(new Color(255, 255, 255));
		firstName.setBounds(31, 123, 255, 26);
		panel.add(firstName);
		firstName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("LAST NAME");
		lblNewLabel_1_1.setBounds(31, 161, 96, 16);
		panel.add(lblNewLabel_1_1);
		
		lastName = new JTextField();
		lastName.setForeground(Color.WHITE);
		lastName.setColumns(10);
		lastName.setBackground(new Color(119, 136, 153));
		lastName.setBounds(31, 190, 255, 26);
		panel.add(lastName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("EMAIL");
		lblNewLabel_1_1_1.setBounds(31, 238, 96, 16);
		panel.add(lblNewLabel_1_1_1);
		
		email = new JTextField();
		email.setForeground(Color.WHITE);
		email.setColumns(10);
		email.setBackground(new Color(119, 136, 153));
		email.setBounds(31, 262, 255, 26);
		panel.add(email);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1_1_1.setBounds(31, 311, 96, 16);
		panel.add(lblNewLabel_1_1_1_1);
		
		password = new JPasswordField();
		password.setBackground(new Color(119, 136, 153));
		password.setBounds(31, 339, 255, 26);
		panel.add(password);
		
		/*
		 * ================Sign UP BUTTON==================
		 */
		JButton btnNewButton = new JButton("CREATE ACCOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstName.getText().equals("") || lastName.getText().equals("") || email.getText().equals("")
						|| password.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Fill All Information");
					
				}else {
				User tempUser = new User(firstName.getText()+"", lastName.getText()+"", email.getText()+"", password.getText()+"");
				db.insertCustomerIntoDatabase(tempUser);
				dispose();
				CustomerView signUp = new CustomerView(email.getText());
				signUp.setLocationRelativeTo(null);
				signUp.setVisible(true);
				
				   JOptionPane.showMessageDialog(null, "Account Sucessfully Made!\nWelcome to Smart Shoppers");
				}
				
			}
				
		});
		btnNewButton.setBounds(142, 409, 169, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setFont(new Font("Devanagari MT", Font.PLAIN, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(155, 35, 148, 38);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(119, 136, 153));
		panel_1.setBounds(25, 138, 316, 226);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Your Account");
		lblNewLabel.setBounds(31, 73, 261, 91);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Devanagari MT", Font.PLAIN, 28));
		
		JLabel background = new JLabel("");
		background.setBounds(-143, 69, 617, 352);
		contentPane.add(background);
		background.setIcon(cropTeeImage);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage homePage = new HomePage();
				homePage.setLocationRelativeTo(null);
				homePage.setVisible(true);
				
			}
		});
		btnBack.setBounds(6, 455, 77, 29);
		contentPane.add(btnBack);
	}
}
