import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoppingSolutionsCartView extends JFrame {

	private JPanel contentPane;
	private final String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingSolutionsCartView frame = new ShoppingSolutionsCartView(null);
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
	public ShoppingSolutionsCartView(String email2) {
		this.email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(0, -11, 820, 540);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(17, 171, 545, 221);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 173, 221);
		panel_3.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Product");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(6, 17, 74, 16);
		panel_3.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(6, 34, 161, 16);
		panel_3.add(separator_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(372, 0, 173, 221);
		panel_3_1.setBackground(new Color(211, 211, 211));
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(6, 17, 74, 16);
		panel_3_1.add(lblNewLabel_2_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(6, 33, 161, 16);
		panel_3_1.add(separator_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setBounds(184, 17, 61, 16);
		panel_2.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(185, 31, 173, 16);
		panel_2.add(separator);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(587, 200, 195, 140);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cart Total");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(51, 6, 87, 31);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setBounds(6, 46, 61, 16);
		panel_4.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Proceed For Pickup");
		btnNewButton.setBounds(22, 105, 149, 29);
		panel_4.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(190, 45, 470, 75);
		panel_1.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MY CART");
		lblNewLabel_1.setBounds(163, 24, 148, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("AppleMyungjo", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*
		 * ===========BACK BUTTON=================
		 */
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VirtualShoppingView main = new VirtualShoppingView(email);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(6, 448, 117, 29);
		panel_1.add(btnNewButton_1);
	}
}
