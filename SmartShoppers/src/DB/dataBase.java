package DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Other.Store;
import User.User;

public class dataBase {


	private Connection connection;
	/**
	 * Creates connection to a particular databse
	 * @param database - name of the database ex: "test.db"
	 * @return
	 */
	public Connection createConnection(String database) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:" + database);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	private void closeConnection() {
		try{
			if(this.connection != null) this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws  IOException {

		dataBase db = new dataBase();
		db.createConnection("Shoppers.db");
		db.closeConnection();

	}

	public User whatAccount (String email) {


		return null;
	}


	/*
	 * Customer Sign Up Needs to be Added to DataBase
	 * 					SIGN UP
	 */
	public User insertCustomerIntoDatabase(User user) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "INSERT INTO CUSTOMER(firstname, lastname, email, password) values(?, ?, ?, ?)";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);

			insertUserStatement.setString(1, user.getFirstName());
			insertUserStatement.setString(2, user.getLastName());
			insertUserStatement.setString(3, user.getEmail());
			insertUserStatement.setString(4, user.getPassword());

			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return user;
	}

	
	/*
	 * 			ADMIN
	 * Insert Manager Into DataBae
	 */
	public User insertManagerIntoDatabase(User user, String store) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "INSERT INTO MANAGER(firstName, lastName, email, password, store) values(?, ?, ?, ?, ?)";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);

			insertUserStatement.setString(1, user.getFirstName());
			insertUserStatement.setString(2, user.getLastName());
			insertUserStatement.setString(3, user.getEmail());
			insertUserStatement.setString(4, user.getPassword());
			insertUserStatement.setString(5, store);

			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return null;
	}

	/*
	 * 			Admin 
	 * Removes Manager From DataBase 
	 */
	public User removeManagerIntoDatabase(String email) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "DELETE FROM MANAGER WHERE email = '" + email+"'";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);



			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return null;
	}
	
	
	/*
	 * Retrives Different Types of Accounts 
	 * 		  Changes GUI VIEW
	 */
	public String getAccount (String email, String password1) {
		createConnection("Shoppers.db");


		try {
			//CUSTOMER
			String queryDataBase = "SELECT * FROM CUSTOMER WHERE email = '" + email+"'";
			PreparedStatement queryStatement = connection.prepareStatement(queryDataBase);



			ResultSet rs = queryStatement.executeQuery();

			while (rs.next())
			{
		
				if (String.valueOf(rs.getString("password")).compareTo(password1) == 0)
				{
				
					closeConnection();
					return "Customer";
				}
			}

			//MANAGER
			queryDataBase = "SELECT * FROM MANAGER WHERE email = '" + email+"'";
			queryStatement = connection.prepareStatement(queryDataBase);



			rs = queryStatement.executeQuery();

			while (rs.next())
			{
				if (rs.getString("password").equals(password1))
				{
					closeConnection();
					return "Manager";
				}
			}


			//ADMIN
			queryDataBase = "SELECT * FROM ADMIN WHERE email = '" + email+"'";
			queryStatement = connection.prepareStatement(queryDataBase);



			rs = queryStatement.executeQuery();

			while (rs.next())
			{
				if (rs.getString("password").equals(password1))
				{
					closeConnection();
					return "Admin";
				}
			}




		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return null;
	}
	
	/*
	 * 			Store
	 * Inserts Store in DataBase
	 */

	public Store insertStoreIntoDatabase(Store store) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "INSERT INTO MANAGER(location, timeOfOperation, manager) values(?, ?, ?)";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);
//
//			insertUserStatement.setString(1, store.getLocation());
//			insertUserStatement.setNString(2, store.getTimeOfOperation());
//			insertUserStatement.Manager(3, store.getManager());
//			insertUserStatement.setString(4, user.getPassword());
//			insertUserStatement.setString(5, store);
			
			insertUserStatement.setInt(1, store.getLocation());
			insertUserStatement.setString(2, store.getTimeOfOperation());
			insertUserStatement.setString(2, store.getManager());

			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return null;
	}
	
	public void insertItemtoCard(String [] item) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "INSERT INTO CART(email, item, quantity, price) values(?, ?, ?, ?)";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);

			insertUserStatement.setString(1, item[0]);
			insertUserStatement.setString(2, item[1]);
			insertUserStatement.setString(3, item[2]);
			insertUserStatement.setString(4, item[3]);
		

			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		
	}
	
	public void removeItemFromCart(String email, String item) {
		createConnection("Shoppers.db");

		try {

			String insertUserIntoTable_sql = "DELETE FROM CART WHERE email = '" + email+"' AND item = '" + item + "'" ;
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);



			insertUserStatement.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
	}
	
	public double cartTotal (String email)
	{
		createConnection("Shoppers.db");
		double sum = 0;
		try {


			String queryDataBase = "SELECT * FROM CART WHERE email = '" + email+"'";
			PreparedStatement queryStatement = connection.prepareStatement(queryDataBase);



			ResultSet rs = queryStatement.executeQuery();

			while (rs.next())
			{
				sum = sum + Double.parseDouble(rs.getString("price").substring(1));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		closeConnection();
		
		return sum;
	}
	
	public String [] getUserProfile (String email)
	{
		createConnection("Shoppers.db");
		String [] user = new String [4];
		
		
		try {


			String queryDataBase = "SELECT * FROM CUSTOMER WHERE email = '" + email+"'";
			PreparedStatement queryStatement = connection.prepareStatement(queryDataBase);
			


			ResultSet rs = queryStatement.executeQuery();

			while (rs.next())
			{
				user[0] = rs.getString("firstName");
				user[1] = rs.getString("lastName");
				user[2] = rs.getString("email");
				user[3] = rs.getString("password");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		closeConnection();
		
		return user;
	}
	
	public void updateUserProfile (String [] user)
	{
		createConnection("Shoppers.db");

		
		
		try {


			String queryDataBase = "DELETE FROM CUSTOMER WHERE email = '" + user[2]+"'";
			PreparedStatement queryStatement = connection.prepareStatement(queryDataBase);
			


			queryStatement.executeUpdate();
			
			String insertUserIntoTable_sql = "INSERT INTO CUSTOMER(firstname, lastname, email, password) values(?, ?, ?, ?)";
			PreparedStatement insertUserStatement = connection.prepareStatement(insertUserIntoTable_sql);

			insertUserStatement.setString(1, user[0]);
			insertUserStatement.setString(2, user[1]);
			insertUserStatement.setString(3, user[2]);
			insertUserStatement.setString(4, user[3]);

			insertUserStatement.executeUpdate();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		closeConnection();

	}

}
