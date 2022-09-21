import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.dataBase;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;
	dataBase db = new dataBase();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {	
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel homePage = new JPanel();
		homePage.setBackground(new Color(119, 136, 153));
		homePage.setBounds(357, 72, 352, 358);
		contentPane.add(homePage);
		homePage.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("EMAIL");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(25, 147, 125, 16);
		homePage.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(25, 204, 125, 16);
		homePage.add(lblNewLabel_3_1_1);
		
		
		/*
		 * =================Sign Up Button==================
		 */
		JButton signUpButton = new JButton("Sign Up");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SignUp signUp = new SignUp();
				signUp.setLocationRelativeTo(null);
				signUp.setVisible(true);
			}
		});
		signUpButton.setBounds(25, 273, 117, 29);
		homePage.add(signUpButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(24, 166, 293, 26);
		homePage.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(25, 224, 293, 26);
		homePage.add(passwordField);
		
		JLabel loginOrSignUp = new JLabel("Login Or Sign Up");
		loginOrSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		loginOrSignUp.setFont(new Font("Devanagari MT", Font.PLAIN, 20));
		loginOrSignUp.setForeground(Color.WHITE);
		loginOrSignUp.setBounds(98, 84, 148, 40);
		homePage.add(loginOrSignUp);
		
		/*
		 * ============Already a Member Button=================
		 */
		JButton alreadyAMemberButton = new JButton("Sign In");
		alreadyAMemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String email = textField_1.getText();
				String pass = passwordField.getText();
				
				String accountType = db.getAccount(email, pass);
				/*
				 * USER NOT FOUND
				 */
				if (accountType == null) {
					JOptionPane.showMessageDialog(null, "User Not Found");
				}
				/*
				 * CUSTOMER
				 */
				else if (accountType.equals("Customer"))
				{
					dispose();
					CustomerView cv = new CustomerView(email);
					cv.setLocationRelativeTo(null);
					cv.setVisible(true);
				}
				/*
				 * ADMIN
				 */
				else if (accountType.equals("Admin"))
				{
					
					dispose();
					AdminView cv = new AdminView();
					cv.setLocationRelativeTo(null);
					cv.setVisible(true);
				}
				/*
				 * MANAGER
				 */
				else if(accountType.equals("Manager")){
					dispose();
					ManagerView mv = new ManagerView();
					mv.setLocationRelativeTo(null);
					mv.setVisible(true);
				}
				
				
		
			}
		});
		alreadyAMemberButton.setBounds(154, 273, 167, 29);
		homePage.add(alreadyAMemberButton);
		
		JLabel backgroundTwo = new JLabel("New label");
		ImageIcon backgroundImageTwo = new ImageIcon(this.getClass().getResource("/background.jpeg").getFile());
		backgroundTwo.setIcon(backgroundImageTwo);
		backgroundTwo.setBounds(265, 23, 511, 272);
		contentPane.add(backgroundTwo);
		
		JLabel welcomeToSmartShoppers = new JLabel("Welcome to Smart Shoppers");
		welcomeToSmartShoppers.setBackground(new Color(0, 0, 0));
		welcomeToSmartShoppers.setFont(new Font("Devanagari MT", Font.PLAIN, 18));
		welcomeToSmartShoppers.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeToSmartShoppers.setForeground(new Color(0, 0, 0));
		welcomeToSmartShoppers.setBounds(24, 225, 229, 30);
		contentPane.add(welcomeToSmartShoppers);
		
		JLabel slogan = new JLabel("Find it, Love it, Buy it");
		slogan.setFont(new Font("Devanagari Sangam MN", Font.ITALIC, 13));
		slogan.setForeground(new Color(0, 0, 0));
		slogan.setHorizontalAlignment(SwingConstants.CENTER);
		slogan.setBounds(61, 256, 143, 16);
		contentPane.add(slogan);
		
		JLabel background = new JLabel("New label");
		ImageIcon backgroundImage = new ImageIcon(this.getClass().getResource("/background.jpeg").getFile());
		background.setIcon(backgroundImage);
		background.setBounds(265, 291, 511, 193);
		contentPane.add(background);
		
		
	}
}
