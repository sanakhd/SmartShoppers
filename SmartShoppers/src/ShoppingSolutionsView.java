import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class ShoppingSolutionsView extends JFrame {

	private JPanel contentPane;
	private final String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingSolutionsView frame = new ShoppingSolutionsView(null);
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
	public ShoppingSolutionsView(String email2) {
		this.email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 230, 1200, 700 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Shop By Category\nJoggers\nCrewneck\nShirt");
		panel.setBackground(new Color(220, 220, 220));
		panel.setForeground(new Color(128, 0, 128));
		panel.setBounds(0, 0, 1200, 672);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 469, 685);
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setForeground(Color.BLACK);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		/*
		 * ====================Welcome to VS Label========================
		 */
		JLabel lblNewLabel = new JLabel("Welcome to Shopping Solutions");
		lblNewLabel.setBounds(38, 540, 373, 63);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Devanagari MT", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		/*
		 * ==================VIRTUAL IMAGE=========================
		 */
		JLabel virtualShop = new JLabel("New label");
		ImageIcon virtualShopimgage = new ImageIcon(this.getClass().getResource("/shoppingsolutions.png").getFile());
		
		/*
		 * ==================BACK BUTTON==========================
		 */
		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CustomerView cv = new CustomerView(email);
				cv.setLocationRelativeTo(null);
				cv.setVisible(true);
			}
		});
		btnNewButton_5.setForeground(new Color(102, 102, 102));
		btnNewButton_5.setBackground(new Color(102, 102, 102));
		btnNewButton_5.setBounds(6, 645, 61, 20);
		panel_1.add(btnNewButton_5);
		virtualShop.setIcon(virtualShopimgage);
		virtualShop.setBounds(-274, 38, 793, 595);
		panel_1.add(virtualShop);
		
		/*
		 * ===================Womens Label==========================
		 */
		
		JLabel womens = new JLabel("Womens");
		womens.setBounds(504, 19, 61, 16);
		womens.setFont(new Font("Devanagari MT", Font.BOLD, 15));
		womens.setBackground(new Color(0, 0, 0));
		womens.setForeground(new Color(0, 0, 0));
		panel.add(womens);
	
		
		/*
		 * ==============BLACK JOGGERS IMAGE & LABEL=====================
		 */
		JLabel blackJoggers = new JLabel("New label");
		blackJoggers.setBounds(504, 37, 134, 223);
		ImageIcon blackJogImage = new ImageIcon(this.getClass().getResource("/blackjoggers.png").getFile());
		blackJoggers.setIcon(blackJogImage);
		panel.add(blackJoggers);
		
		JLabel lblNewLabel_4 = new JLabel("Black Joggers");
		lblNewLabel_4.setBounds(504, 261, 145, 16);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		panel.add(lblNewLabel_4);
		/*
		 * ==============BlACK CREWNECK IMAGE & LABEL=====================
		 */
		JLabel blackCrewneck = new JLabel("New label");
		blackCrewneck.setBounds(669, 37, 125, 223);
		ImageIcon crewNeckimgage = new ImageIcon(this.getClass().getResource("/blackcrewneck.png").getFile());
		blackCrewneck.setIcon(crewNeckimgage);
		panel.add(blackCrewneck);
		
		JLabel blackCrew = new JLabel("Black Crewneck");
		blackCrew.setBounds(661, 261, 145, 16);
		blackCrew.setHorizontalAlignment(SwingConstants.CENTER);
		blackCrew.setForeground(Color.WHITE);
		panel.add(blackCrew);
		
		/*
		 * ==============BlACK CROP TEE IMAGE & LABEL======================
		 */
		JLabel cropTee = new JLabel("New label");
		cropTee.setBounds(839, 37, 125, 223);
		ImageIcon cropTeeImage = new ImageIcon(this.getClass().getResource("/cropTee.png").getFile());
		cropTee.setIcon(cropTeeImage);
		panel.add(cropTee);
		
		JLabel cropTeeLabel = new JLabel("Black Cropped Tee");
		cropTeeLabel.setBounds(819, 261, 145, 16);
		cropTeeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cropTeeLabel.setForeground(Color.WHITE);
		panel.add(cropTeeLabel);
		
		

		/*
		 * ===================MENS LABEL==================================
		 */
		JLabel lblNewLabel_3_1 = new JLabel("Mens");
		lblNewLabel_3_1.setBounds(504, 362, 61, 18);
		lblNewLabel_3_1.setFont(new Font("Devanagari MT", Font.BOLD, 15));
		lblNewLabel_3_1.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_3_1);
		
		/*
		 * ==============STONE JOGGERS IMAGE & LABEL=======================
		 */
		JLabel stoneJoggersIm = new JLabel("New label");
		stoneJoggersIm.setBounds(504, 392, 119, 186);
		ImageIcon stoneJoggersImage = new ImageIcon(this.getClass().getResource("/stonejoggers.png").getFile());
		stoneJoggersIm.setIcon(stoneJoggersImage);
		panel.add(stoneJoggersIm);
		
		JLabel lblNewLabel_4_2 = new JLabel("Stone Joggers");
		lblNewLabel_4_2.setBounds(493, 579, 145, 16);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		panel.add(lblNewLabel_4_2);
		
		
		/*
		 * ==============STONE CREWNECK IMAGE & LABEL=====================
		 */
		JLabel stoneCrew = new JLabel("New label");
		stoneCrew.setBounds(669, 392, 137, 180);
		ImageIcon stoneCrewImage = new ImageIcon(this.getClass().getResource("/stonecrewneck.png").getFile());
		stoneCrew.setIcon(stoneCrewImage);
		panel.add(stoneCrew);
		
		JLabel stoneCrewLabel = new JLabel("Stone Crewneck");
		stoneCrewLabel.setBounds(661, 579, 145, 16);
		stoneCrewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stoneCrewLabel.setForeground(Color.WHITE);
		panel.add(stoneCrewLabel);
		

		/*
		 * ==============STONE TEE IMAGE & LABEL=========================
		 */
		JLabel stoneTee = new JLabel("New label");
		stoneTee.setBounds(839, 394, 125, 183);
		ImageIcon stoneTeeImage = new ImageIcon(this.getClass().getResource("/stonetee.png").getFile());
		stoneTee.setIcon(stoneTeeImage);
		panel.add(stoneTee);
		
		JLabel stoneTeeLabel = new JLabel("Stone Tee");
		stoneTeeLabel.setBounds(839, 579, 115, 16);
		stoneTeeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stoneTeeLabel.setForeground(Color.WHITE);
		panel.add(stoneTeeLabel);
		
		/*
		 * ========================PRICES WOMENS==========================
		 */
		
		JLabel lblNewLabel_7 = new JLabel("$35");
		lblNewLabel_7.setBounds(541, 275, 61, 35);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("$20");
		lblNewLabel_7_1.setBounds(703, 279, 61, 26);
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("$10");
		lblNewLabel_7_1_1.setBounds(869, 284, 61, 16);
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_1_1);
		

		/*
		 * ========================PRICES MENS===============================
		 */
	
		JLabel lblNewLabel_7_2 = new JLabel("$35");
		lblNewLabel_7_2.setBounds(525, 594, 77, 26);
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7_2);
		
	
		JLabel lblNewLabel_10 = new JLabel("$20");
		lblNewLabel_10.setBounds(703, 599, 61, 16);
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_10);
		
		
		JLabel lblNewLabel_12 = new JLabel("$10");
		lblNewLabel_12.setBounds(869, 599, 61, 16);
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_12);
		
		/*
		 * ==================ADD TO CART=================================
		 */
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.setBounds(525, 313, 100, 26);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.setBounds(689, 313, 100, 26);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Add To Cart");
		btnNewButton_1_1.setBounds(854, 313, 100, 26);
		panel.add(btnNewButton_1_1);
		

		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setBounds(504, 619, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.setBounds(677, 619, 117, 29);
		panel.add(btnNewButton_3);
		
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.setBounds(847, 619, 117, 29);
		panel.add(btnNewButton_4);
		
		/*
		 * ============MY CART BUTTON=================
		 */
		JButton myCart = new JButton("My Cart");
		myCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ShoppingSolutionsCartView myCart = new ShoppingSolutionsCartView(email);
				myCart.setLocationRelativeTo(null);
				myCart.setVisible(true);
				
			}
		});
		myCart.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		myCart.setForeground(new Color(0, 0, 0));
		myCart.setBackground(new Color(186, 85, 211));
		myCart.setBounds(1061, 11, 117, 35);
		panel.add(myCart);
		
		JButton myProfile = new JButton("My Profile");
		myProfile.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		myProfile.setForeground(new Color(0, 0, 0));
		myProfile.setBounds(1061, 52, 117, 35);
		panel.add(myProfile);
		
		/*
		 * ================J COMBO BOX BUTTON --> CATEGORY OPTIONS====================
		 */
		JComboBox<String> category = new JComboBox<String>();
		category.setFont(new Font("Devanagari MT", Font.PLAIN, 13));
		category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String value = (String) category.getSelectedItem(); // get the selected item in the combobox
		        switch(value){
		        case "Joggers":
		            ShoppingSolutionsJoggersCategory b1 = new ShoppingSolutionsJoggersCategory(email); // call the class
		            b1.setLocationRelativeTo(null);
		            b1.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Crewneck":
		        	 ShoppingSolutionsCrewneckCategory b2 = new  ShoppingSolutionsCrewneckCategory(email); // call the class
		            b2.setLocationRelativeTo(null);
		            b2.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Shirt":
		        	ShoppingSolutionsShirtCategory b3 = new  ShoppingSolutionsShirtCategory(email); // call the class
		            b3.setLocationRelativeTo(null);
		            b3.setVisible(true);    // set the jframe to visible 
		            break;
		        }	
			}
		});
		category.setToolTipText("");
		category.setMaximumRowCount(3);
		category.setModel(new DefaultComboBoxModel<String>(new String[] {"Joggers", "Crewneck", "Shirt"}));
		category.setBounds(1054, 340, 124, 27);
		panel.add(category);
		
		JLabel lblNewLabel_1 = new JLabel("Shop by Category");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Devanagari MT", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(1054, 311, 124, 35);
		panel.add(lblNewLabel_1);
		
		
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
		btnLogout.setBounds(1061, 90, 117, 35);
		panel.add(btnLogout);
		
	   
       
	}
}
