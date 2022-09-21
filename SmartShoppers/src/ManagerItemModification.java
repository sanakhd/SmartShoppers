import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ManagerItemModification extends JFrame {

	private JPanel contentPane;
	
	Connection connection = null;
	private JTextField id;
	private JTextField name;
	private JTextField price;
	private JTextField quantity;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel model;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JLabel lblNewLabel_1;
	private JTextField category;
	private JButton btnLogOut;
	private JButton btnBack;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerItemModification frame = new ManagerItemModification();
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
	public ManagerItemModification() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(1, 1, 794, 466);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(35, 94, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("Name:");
		lblFirstName.setBounds(35, 122, 118, 16);
		panel.add(lblFirstName);
	
		JLabel lblLastName = new JLabel("Price:");
		lblLastName.setBounds(35, 149, 108, 16);
		panel.add(lblLastName);
		
		JLabel lblemail = new JLabel("Quantity:");
		lblemail.setBounds(35, 177, 69, 16);
		panel.add(lblemail);
		
		JLabel lblManagerToStore = new JLabel("Category:");
		lblManagerToStore.setBounds(35, 206, 86, 16);
		panel.add(lblManagerToStore);

		
		id = new JTextField();
		id.setBounds(141, 89, 108, 26);
		panel.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(141, 117, 108, 26);
		panel.add(name);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(141, 144, 108, 26);
		panel.add(price);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(141, 172, 108, 26);
		panel.add(quantity);
		
		
		category = new JTextField();
		category.setColumns(10);
		category.setBounds(141, 201, 108, 26);
		panel.add(category);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(261, 81, 514, 265);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		model = new DefaultTableModel();
		Object[] column = {"ID", "Name", "Price", "Quantity", "Category"};
		final Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		/*
		 * ==================ADDD BUTTON================
		 */
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || name.getText().equals("") || price.getText().equals("") || quantity.getText().equals("")
						|| category.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill All Information");
				}else {
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = price.getText();
					row[3] = quantity.getText();
					row[4] = category.getText();
				
					model.addRow(row);
					
					id.setText("");
					name.setText("");
					price.setText("");
					quantity.setText("");
					category.setText("");;
					
					JOptionPane.showMessageDialog(null, "Added Succesfully! ");
					
					
				}
				
			}
		});
		btnNewButton.setBounds(35, 247, 86, 29);
		panel.add(btnNewButton);
		
		/*
		 * ===============REMOVE BUTTON================
		 */
		btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Removed Succesfully! ");
				}else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First! ");
					
				}
			}
		});
		btnRemove.setBounds(151, 247, 86, 29);
		panel.add(btnRemove);
		
		lblNewLabel_1 = new JLabel("Item Management\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(392, 40, 231, 26);
		panel.add(lblNewLabel_1);
		
		
		/*
		 * ========LOGOUT BUTTON===========
		 */
		btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage homepage = new HomePage();
				homepage.setLocationRelativeTo(null);
				homepage.setVisible(true);
			}
		});
		btnLogOut.setBounds(667, 417, 108, 29);
		panel.add(btnLogOut);
		
		/*
		 * ========BACK BUTTON===========
		 */
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ManagerView adminView = new ManagerView();
				adminView.setLocationRelativeTo(null);
				adminView.setVisible(true);
			}
		});
		btnBack.setBounds(672, 386, 103, 29);
		panel.add(btnBack);
		
	
		
	}
}
