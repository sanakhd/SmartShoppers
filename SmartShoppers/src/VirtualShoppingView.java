import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.dataBase;
import User.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;




public class VirtualShoppingView extends JFrame {

	private JPanel contentPane;
	private final String email;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualShoppingView frame = new VirtualShoppingView(null);
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
	public VirtualShoppingView(String email2) {
		this.email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(230, 230, 1096, 900 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Shop By Category\nJoggers\nCrewneck\nShirt");
		panel.setBackground(new Color(255, 240, 245));
		panel.setForeground(new Color(128, 0, 128));
		panel.setBounds(1, -4, 1199, 890);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*
		 * ==================VIRTUAL IMAGE=========================
		 */
		ImageIcon virtualShopimgage = new ImageIcon(this.getClass().getResource("/virtualshoppinglogo.png").getFile());
		
		/*
		 * ===================Womens Label==========================
		 */
		
		JLabel womens = new JLabel("Womens");
		womens.setBounds(289, 212, 107, 30);
		womens.setFont(new Font("Devanagari MT", Font.BOLD, 17));
		womens.setBackground(new Color(0, 0, 0));
		womens.setForeground(new Color(0, 0, 0));
		panel.add(womens);
	
		
		/*
		 * ==============BLACK JOGGERS IMAGE & LABEL=====================
		 */
		JLabel blackJoggers = new JLabel("New label");
		blackJoggers.setBounds(289, 244, 134, 223);
		ImageIcon blackJogImage = new ImageIcon(this.getClass().getResource("/blackjoggers.png").getFile());
		blackJoggers.setIcon(blackJogImage);
		panel.add(blackJoggers);
		
		JLabel lblNewLabel_4 = new JLabel("Black Joggers");
		lblNewLabel_4.setBounds(289, 468, 145, 16);
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_4);
		/*
		 * ==============BlACK CREWNECK IMAGE & LABEL=====================
		 */
		JLabel blackCrewneck = new JLabel("New label");
		blackCrewneck.setBounds(454, 244, 125, 223);
		ImageIcon crewNeckimgage = new ImageIcon(this.getClass().getResource("/blackcrewneck.png").getFile());
		blackCrewneck.setIcon(crewNeckimgage);
		panel.add(blackCrewneck);
		
		JLabel blackCrew = new JLabel("Black Crewneck");
		blackCrew.setBounds(446, 468, 145, 16);
		blackCrew.setHorizontalAlignment(SwingConstants.CENTER);
		blackCrew.setForeground(new Color(0, 0, 0));
		panel.add(blackCrew);
		
		/*
		 * ==============BlACK CROP TEE IMAGE & LABEL======================
		 */
		JLabel cropTee = new JLabel("New label");
		cropTee.setBounds(624, 244, 125, 223);
		ImageIcon cropTeeImage = new ImageIcon(this.getClass().getResource("/cropTee.png").getFile());
		cropTee.setIcon(cropTeeImage);
		panel.add(cropTee);
		
		JLabel cropTeeLabel = new JLabel("Black Cropped Tee");
		cropTeeLabel.setBounds(617, 467, 145, 16);
		cropTeeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cropTeeLabel.setForeground(new Color(0, 0, 0));
		panel.add(cropTeeLabel);
		
		

		/*
		 * ===================MENS LABEL==================================
		 */
		JLabel lblNewLabel_3_1 = new JLabel("Mens");
		lblNewLabel_3_1.setBounds(292, 572, 61, 31);
		lblNewLabel_3_1.setFont(new Font("Devanagari MT", Font.BOLD, 18));
		lblNewLabel_3_1.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_3_1);
		
		/*
		 * ==============STONE JOGGERS IMAGE & LABEL=======================
		 */
		JLabel stoneJoggersIm = new JLabel("New label");
		stoneJoggersIm.setBounds(294, 607, 119, 186);
		ImageIcon stoneJoggersImage = new ImageIcon(this.getClass().getResource("/stonejoggers.png").getFile());
		stoneJoggersIm.setIcon(stoneJoggersImage);
		panel.add(stoneJoggersIm);
		
		JLabel lblNewLabel_4_2 = new JLabel("Stone Joggers");
		lblNewLabel_4_2.setBounds(283, 794, 145, 16);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_4_2);
		
		
		/*
		 * ==============STONE CREWNECK IMAGE & LABEL=====================
		 */
		JLabel stoneCrew = new JLabel("New label");
		stoneCrew.setBounds(461, 605, 134, 180);
		ImageIcon stoneCrewImage = new ImageIcon(this.getClass().getResource("/stonecrewneck.png").getFile());
		stoneCrew.setIcon(stoneCrewImage);
		panel.add(stoneCrew);
		
		JLabel stoneCrewLabel = new JLabel("Stone Crewneck");
		stoneCrewLabel.setBounds(457, 791, 145, 16);
		stoneCrewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stoneCrewLabel.setForeground(new Color(0, 0, 0));
		panel.add(stoneCrewLabel);
		

		/*
		 * ==============STONE TEE IMAGE & LABEL=========================
		 */
		JLabel stoneTee = new JLabel("New label");
		stoneTee.setBounds(639, 607, 125, 183);
		ImageIcon stoneTeeImage = new ImageIcon(this.getClass().getResource("/stonetee.png").getFile());
		stoneTee.setIcon(stoneTeeImage);
		panel.add(stoneTee);
		
		JLabel stoneTeeLabel = new JLabel("Stone Tee");
		stoneTeeLabel.setBounds(639, 792, 115, 16);
		stoneTeeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stoneTeeLabel.setForeground(new Color(0, 0, 0));
		panel.add(stoneTeeLabel);
		
		/*
		 * ========================PRICES WOMENS==========================
		 */
		
		JLabel lblNewLabel_7 = new JLabel("$35");
		lblNewLabel_7.setBounds(326, 482, 61, 35);
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("$20");
		lblNewLabel_7_1.setBounds(488, 486, 61, 26);
		lblNewLabel_7_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("$10");
		lblNewLabel_7_1_1.setBounds(654, 491, 61, 16);
		lblNewLabel_7_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_1_1);
		

		/*
		 * ========================PRICES MENS===============================
		 */
	
		JLabel lblNewLabel_7_2 = new JLabel("$35");
		lblNewLabel_7_2.setBounds(315, 809, 77, 26);
		lblNewLabel_7_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_2);
		
	
		JLabel lblNewLabel_10 = new JLabel("$20");
		lblNewLabel_10.setBounds(499, 811, 61, 16);
		lblNewLabel_10.setForeground(new Color(0, 0, 0));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_10);
		
		
		JLabel lblNewLabel_12 = new JLabel("$10");
		lblNewLabel_12.setBounds(669, 812, 61, 16);
		lblNewLabel_12.setForeground(new Color(0, 0, 0));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_12);
		
		/*
		 * ==================ADD TO CART=================================
		 */
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Black Joggers","1","$35"};
				  db.insertItemtoCard(table);
				  
						  
				  
			}
		});
		btnNewButton.setBounds(310, 520, 100, 26);
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Black Crewneck","1","$20"};
				  db.insertItemtoCard(table);
			}
		});
		btnNewButton_1.setBounds(474, 520, 100, 26);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Add To Cart");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Black Cropped Tee","1","$10"};
				  db.insertItemtoCard(table);
			}
		});
		btnNewButton_1_1.setBounds(639, 520, 100, 26);
		panel.add(btnNewButton_1_1);
		

		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Stone Joggers","1","$35"};
				  db.insertItemtoCard(table);
			}
		});
		btnNewButton_2.setBounds(294, 834, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Stone Crewneck","1","$20"};
				  db.insertItemtoCard(table);
			}
		});
		btnNewButton_3.setBounds(473, 831, 117, 29);
		panel.add(btnNewButton_3);
		
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  dataBase db = new dataBase();
				  String [] table = {email,"Stone Shirt","1","$10"};
				  db.insertItemtoCard(table);
			}
		});
		btnNewButton_4.setBounds(647, 832, 117, 29);
		panel.add(btnNewButton_4);
		
		/*
		 * =============ADD TO CART BUTTON=================
		 */
		JButton myCart = new JButton("My Cart");
		myCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VirtualShoppingCartView myCart = new VirtualShoppingCartView(email);
				myCart.setLocationRelativeTo(null);
				myCart.setVisible(true);
				
			}
		});
		myCart.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		myCart.setForeground(new Color(0, 0, 0));
		myCart.setBackground(new Color(186, 85, 211));
		myCart.setBounds(790, 26, 100, 35);
		panel.add(myCart);
		
		JButton myProfile = new JButton("My Profile");
		myProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CustomerProfileView profile = new CustomerProfileView(email);
				profile.setLocationRelativeTo(null);
				profile.setVisible(true);
			}
		});
		myProfile.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		myProfile.setForeground(new Color(0, 0, 0));
		myProfile.setBounds(902, 26, 84, 35);
		panel.add(myProfile);
		
		/*
		 * ================J COMBO BOX BUTTON --> CATEGORY OPTIONS====================
		 */
		
		
		/*
		 * =============LOGOUT BUTTON================
		 */
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage logout = new HomePage();
				logout.setLocationRelativeTo(null);
				logout.setVisible(true);
			}
		});
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		btnLogout.setBackground(new Color(186, 85, 211));
		btnLogout.setBounds(998, 26, 90, 35);
		panel.add(btnLogout);
		JLabel virtualShop = new JLabel("");
		virtualShop.setBounds(315, 23, 451, 164);
		panel.add(virtualShop);
		virtualShop.setBackground(new Color(253, 245, 230));
		virtualShop.setIcon(virtualShopimgage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(57, 375, 153, 237);
		panel.add(panel_1);
		panel_1.setLayout(null);
		JComboBox<String> category = new JComboBox<String>();
		category.setBounds(10, 97, 124, 27);
		panel_1.add(category);
		category.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String value = (String) category.getSelectedItem(); // get the selected item in the combobox
		        switch(value){
		        case "Joggers":
		            VirtualShoppingJoggersCategory b1 = new VirtualShoppingJoggersCategory(email); // call the class
		            b1.setLocationRelativeTo(null);
		            b1.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Crewneck":
		        	VirtualShoppingCrewneckCategory b2 = new VirtualShoppingCrewneckCategory(email); // call the class
		            b2.setLocationRelativeTo(null);
		            b2.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Shirt":
		        	VirtualShoppingShirtCategory b3 = new VirtualShoppingShirtCategory(email); // call the class
		            b3.setLocationRelativeTo(null);
		            b3.setVisible(true);    // set the jframe to visible 
		            break;
		        }	
			}
		});
		category.setToolTipText("");
		category.setMaximumRowCount(3);
		category.setModel(new DefaultComboBoxModel<String>(new String[] {"Joggers", "Crewneck", "Shirt"}));
		
		JLabel lblNewLabel_1 = new JLabel("Shop by Category");
		lblNewLabel_1.setBounds(12, 62, 124, 35);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Devanagari MT", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(888, 366, 153, 237);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Welcome to Virtual");
		lblNewLabel_1_1.setBounds(7, 33, 133, 26);
		panel_1_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("Shopping!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 60, 89, 16);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Your World Of Comfort");
		lblNewLabel_2.setBounds(7, 94, 185, 16);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblAwaits = new JLabel("Awaits.");
		lblAwaits.setHorizontalAlignment(SwingConstants.CENTER);
		lblAwaits.setBounds(29, 110, 89, 16);
		panel_1_1.add(lblAwaits);
		
		JLabel lblNewLabel_3 = new JLabel("We've Got You!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(7, 138, 141, 16);
		panel_1_1.add(lblNewLabel_3);
		
	   
       
	}
}
