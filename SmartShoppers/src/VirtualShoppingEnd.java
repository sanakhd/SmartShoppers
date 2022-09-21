import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VirtualShoppingEnd extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualShoppingEnd frame = new VirtualShoppingEnd();
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
	public VirtualShoppingEnd() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon loadingIm = new ImageIcon(this.getClass().getResource("/giphy2.gif").getFile());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(70, 56, 449, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel loading = new JLabel("");
		loading.setBackground(new Color(255, 240, 245));
		loading.setBounds(60, 6, 300, 250);
		panel.add(loading);
		loading.setIcon(loadingIm);
		
		JLabel lblNewLabel = new JLabel("You're All Set!");
		lblNewLabel.setBounds(174, 6, 244, 52);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Devanagari MT", Font.ITALIC, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Your Order is Ready For Pick Up!");
		lblNewLabel_1.setFont(new Font("Devanagari MT", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 336, 284, 37);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("View Store Map");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VirtualShoppingMap signUp = new VirtualShoppingMap();
				signUp.setLocationRelativeTo(null);
				signUp.setVisible(true);
			}
		});
		btnNewButton.setBounds(233, 373, 133, 29);
		contentPane.add(btnNewButton);
		

		


	}
}
