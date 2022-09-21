import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DB.dataBase;
import User.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.table.*;




public class VirtualShoppingCartView extends JFrame {

	private JPanel contentPane;
	private static JTable table;

	private JScrollPane scrollPane;
	DefaultTableModel model;
	private final String email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualShoppingCartView frame = new VirtualShoppingCartView(null);
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
	public VirtualShoppingCartView(String email2) {

		this.email = email2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(0, -11, 820, 491);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(606, 196, 195, 140);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cart Total");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(52, 6, 87, 31);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total:");
		lblNewLabel_5.setBounds(6, 46, 61, 16);
		panel_4.add(lblNewLabel_5);
		
		/*
		 * PROCEED FOR PICKUP BUTTON 
		 */
		JButton btnNewButton = new JButton("Proceed For Pickup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VirtualShoppingEnd profile = new VirtualShoppingEnd();
				profile.setLocationRelativeTo(null);
				profile.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(22, 105, 149, 29);
		panel_4.add(btnNewButton);
		
		dataBase db2 = new dataBase();
		JLabel lblNewLabel = new JLabel("$"+db2.cartTotal(email));
		lblNewLabel.setBounds(61, 46, 61, 16);
		panel_4.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(292, 46, 239, 75);
		panel_1.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
	
       
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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 145, 534, 265);
		panel_1.add(scrollPane);
	
		
		JLabel lblNewLabel_1 = new JLabel("MY CART");
		lblNewLabel_1.setBounds(48, 22, 148, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("AppleMyungjo", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        model = new DefaultTableModel();
        Object[] column = {"Item", "Quantity", "Price"};
        final Object[] row = new Object[4];
        model.setColumnIdentifiers(column);
        
    	
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setModel(model);
		scrollPane.setViewportView(table);
		btnNewButton_1.setBounds(684, 434, 117, 29);
		panel_1.add(btnNewButton_1);
		
		/*
		 * REMOVE BUTTON
		 */
		JButton btnNewButton_1_1 = new JButton("REMOVE ITEM");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataBase db = new dataBase();
				int i = table.getSelectedRow();
				if(i >= 0) {
					db.removeItemFromCart(email,String.valueOf(model.getValueAt(i, 0)));
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Removed Succesfully! ");
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
				dispose();
				VirtualShoppingCartView main = new VirtualShoppingCartView(email);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			
			}
		});
		btnNewButton_1_1.setBounds(18, 434, 117, 29);
		panel_1.add(btnNewButton_1_1);
		dataBase db = new dataBase();
		try {
			
			model.setRowCount(0);
			Connection tempConnect = db.createConnection("Shoppers.db");
			Statement st = tempConnect.createStatement();
			String sqlCommand = "SELECT * FROM CART WHERE email = '" + email + "'";
			ResultSet rs = st.executeQuery(sqlCommand);
			
				String [] row2= new String [4];
				while (rs.next())
				{
					row2[0] = String.valueOf(rs.getString("item"));
					row2[1] = String.valueOf(rs.getString("quantity"));
					row2[2] = String.valueOf(rs.getString("price"));


					
					 model.addRow(row2);
					
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		


	}
}
