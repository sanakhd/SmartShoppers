import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoppingSolutionsCrewneckCategory extends JFrame {
	
	private final String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingSolutionsCrewneckCategory frame = new ShoppingSolutionsCrewneckCategory(null);
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
	public ShoppingSolutionsCrewneckCategory(String email2) {
		this.email = email2;
		getContentPane().setBackground(new Color(245, 245, 245));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 736);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setForeground(new Color(248, 248, 255));
		panel.setBounds(356, 31, 202, 247);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name: Black Crewneck");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(6, 23, 190, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price: $20");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(6, 51, 109, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>\nDescription: <br>\nNail this season's latest trends this! <br>\nFeaturing a black material with long <br>\nsleeves and a comfy oversized fit. <br>\n<html>");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(6, 79, 190, 112);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("<html>\nQuantity: <br>\nAvaliable!\n<html>");
		lblNewLabel_3.setBounds(6, 193, 190, 48);
		panel.add(lblNewLabel_3);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(41, 17, 260, 313);
		getContentPane().add(panel_1);
		
		JLabel blackCrew = new JLabel("Black Crewneck");
		blackCrew.setBounds(53, 50, 138, 220);
		ImageIcon blackCrewImage = new ImageIcon(this.getClass().getResource("/blackcrewneck.png").getFile());
		panel_1.setLayout(null);
		blackCrew.setIcon(blackCrewImage);
		panel_1.add(blackCrew);
		
		JLabel lblNewLabel = new JLabel("Womens Crewneck");
		lblNewLabel.setBounds(54, 23, 137, 16);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(41, 350, 260, 313);
		getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Mens Crewneck");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(54, 23, 137, 16);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel stoneJoggers = new JLabel("New label");
		stoneJoggers.setBounds(54, 54, 137, 212);
		panel_1_1.add(stoneJoggers);
		ImageIcon stoneJoggersIm = new ImageIcon(this.getClass().getResource("/stonecrewneck.png").getFile());
		stoneJoggers.setIcon(stoneJoggersIm);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(248, 248, 255));
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(356, 372, 202, 247);
		getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name: Stone Joggers");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setBounds(6, 23, 190, 16);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Price: $35");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(6, 51, 109, 16);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html>\nDescription: <br>\nNail this season's latest trends this! <br>\nFeaturing a stone material with long <br>\nsleeves and a comfy oversized fit. <br>\n<html>");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setBounds(6, 79, 190, 117);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html>\nQuantity: <br>\nAvaliable!\n<html>");
		lblNewLabel_3_1.setBounds(6, 193, 190, 48);
		panel_2.add(lblNewLabel_3_1);
		
		
		/*
		 * =====================BACK TO MAIN BUTTON==========================
		 */
		JButton btnNewButton = new JButton("Back to Main");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VirtualShoppingView backToMain = new VirtualShoppingView(email);
				backToMain.setLocationRelativeTo(null);
				backToMain.setVisible(true);
			}
		});
		btnNewButton.setBounds(482, 660, 117, 29);
		getContentPane().add(btnNewButton);
	}
}
