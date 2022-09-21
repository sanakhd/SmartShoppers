import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.dataBase;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerView extends JFrame {

	private JPanel contentPane;
	private dataBase db;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ManagerView frame = new ManagerView();
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
	public ManagerView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 617, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manager");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(238, 28, 131, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(177, 97, 266, 231);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Back!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(67, 20, 128, 47);
		panel_1.add(lblNewLabel_1);
		
		/*
		 * =================STORE SYSTEM BUTTON============
		 */
		JButton btnStore = new JButton("Store System");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManagerStoreModification storePage = new ManagerStoreModification();
				storePage.setLocationRelativeTo(null);
				storePage.setVisible(true);
			}
		});
		btnStore.setBounds(67, 105, 117, 29);
		panel_1.add(btnStore);
		
		JLabel lblNewLabel_2 = new JLabel("Modifications can be Made Below");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 62, 228, 16);
		panel_1.add(lblNewLabel_2);
		
		JButton btnItemSystem = new JButton("Item System");
		btnItemSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManagerItemModification storePage = new ManagerItemModification();
				storePage.setLocationRelativeTo(null);
				storePage.setVisible(true);
				
			}
		});
		btnItemSystem.setBounds(67, 146, 117, 29);
		panel_1.add(btnItemSystem);
	}

}
