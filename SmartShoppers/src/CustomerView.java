import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerView extends JFrame {

	private JPanel contentPane;
	private final String email;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerView frame = new CustomerView(null);
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
	public CustomerView(String email2) {
		this.email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 807, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Pick Out Your Preferred Store...");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Devanagari MT", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(40, 139, 216, 27);
		panel.add(lblNewLabel_1);
		
		/*
		 * ================J COMBO BOX BUTTON --> STORE OPTIONS====================
		 */
		JComboBox<String> storeChoice = new JComboBox<String>();
		storeChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String value = (String) storeChoice.getSelectedItem(); // get the selected item in the combobox
		        switch(value){
		        case "Virtual Shopping":
		            VirtualShoppingView b1 = new VirtualShoppingView(email); // call the class
		            b1.setLocationRelativeTo(null);
		            b1.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Shopping Solutions":
		        	ShoppingSolutionsView b2 = new ShoppingSolutionsView(email); // call the class
		            b2.setLocationRelativeTo(null);
		            b2.setVisible(true);    // set the jframe to visible 
		            break;
		        case "Smart Shop":
		        	SmartShopView b3 = new SmartShopView(email); // call the class
		            b3.setLocationRelativeTo(null);
		            b3.setVisible(true);    // set the jframe to visible 
		            break;
		        }	
			}
		});
		storeChoice.setToolTipText("");
		storeChoice.setMaximumRowCount(4);
		storeChoice.setModel(new DefaultComboBoxModel<String>(new String[] {"Virtual Shopping", "Shopping Solutions", "Smart Shop"}));
		storeChoice.setBounds(31, 162, 208, 27);
		panel.add(storeChoice);
		
		
		JLabel smartShoppers = new JLabel("New label");
		ImageIcon smartShoppersImage= new ImageIcon(this.getClass().getResource("/ss.png").getFile());
		
		JLabel lblNewLabel_1_1 = new JLabel("We care for our customers which is why we want them to feel smart while shopping by");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Devanagari MT", Font.ITALIC, 16));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(123, 17, 587, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("minimizing the costs associated with shopping trips & maximizing the benefits.\n\n");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Devanagari MT", Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(147, 45, 550, 40);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Lets Start Shopping!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Hoefler Text", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(315, 97, 179, 27);
		panel.add(lblNewLabel);
		
		
		/*
		 * ================BACK BUTTON======================
		 */
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage back = new HomePage();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
			}
		});
		back.setBounds(669, 455, 117, 29);
		panel.add(back);
		smartShoppers.setIcon(smartShoppersImage);
		smartShoppers.setBounds(0, 0, 807, 505);
		panel.add(smartShoppers);
	}
}
