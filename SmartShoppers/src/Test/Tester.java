package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Other.Item;
import Other.Store;
import User.User;


class Tester {
	
	
	/*
	 * CUSTOMER
	 */

	@Test
	public void getCustomerFirstName() {
		User user = new User("Sana", "Khademi", "sanakhd@gmail.com", "pass2000");
		assertEquals("Sana", user.getFirstName());
		
	}
	
	@Test
	public void getCustomerFirstName2() {
		User user = new User("Luffy", "Khademi", "sanakhd@gmail.com", "pass2000");
		assertEquals("Luffy", user.getFirstName());
		
	}

	@Test
	public void getCustomerLastName() {
		User user = new User("Sana", "Khademi", "sanakhd@gmail.com", "pass2000");
		assertEquals("Khademi", user.getLastName());
		
	}
	
	@Test
	public void getCustomerLastName2() {
		User user = new User("Sana", "D", "sanakhd@gmail.com", "pass2000");
		assertEquals("D", user.getLastName());
		
	}
	

	@Test
	public void getCustomerEmail() {
		User user = new User("Sana", "Khademi", "sanakhd@gmail.com", "pass2000");
		assertEquals("sanakhd@gmail.com", user.getEmail());
		
	}
	
	@Test
	public void getCustomerEmail2() {
		User user = new User("Sana", "Khademi", "sanakhd12@gmail.com", "pass2000");
		assertEquals("sanakhd12@gmail.com", user.getEmail());
		
	}
	
	@Test
	public void getCustomerPassword() {
		User user = new User("Sana", "Khademi", "sanakhd@gmail.com", "pass2000");
		assertEquals("pass2000", user.getPassword());
		
	}
	
	@Test
	public void getCustomerPassword2() {
		User user = new User("Sana", "Khademi", "sanakhd@gmail.com", "pass2002");
		assertEquals("pass2002", user.getPassword());
		
	}

	
	/*
	 * MANAGER
	 */
	@Test
	public void getManagerFirstName() {
		User user = new User("M", "S", "ms@gmail.com", "pass2022");
		assertEquals("M", user.getFirstName());
		
	}
	
	

	@Test
	public void getManagerLastName() {
		User user = new User("M", "S", "ms@gmail.com", "pass2022");
		assertEquals("S", user.getLastName());
		
	}
	
	@Test
	public void getManagerEmail() {
		User user = new User("M", "S", "ms@gmail.com", "pass2022");
		assertEquals("ms@gmail.com", user.getEmail());
		
	}

	@Test
	public void getManagerPassword() {
		User user = new User("M", "S", "ms@gmail.com", "pass2022");
		assertEquals("pass2022", user.getPassword());
		
	}
	
	
	
	/*
	 * ADMIN
	 */
	
	@Test
	public void getAdminFirstName() {
		User user = new User("L", "B", "lbs@gmail.com", "pass2050");
		assertEquals("L", user.getFirstName());
		
	}
	
	

	@Test
	public void getAdminLastName() {
		User user = new User("L", "B", "lbs@gmail.com", "pass2050");
		assertEquals("B", user.getLastName());
		
	}
	
	@Test
	public void getAdminEmail() {
		User user = new User("L", "B", "lbs@gmail.com", "pass2050");
		assertEquals("lbs@gmail.com", user.getEmail());
		
	}

	@Test
	public void getAdminPassword() {
		User user = new User("L", "B", "lbs@gmail.com", "pass2050");
		assertEquals("pass2050", user.getPassword());
		
	}

	/*
	 * ITEM
	 */

	@Test 
	public void getItem() {
		Item item = new Item(1, "joggers","comfy",10.0);
		assertEquals(1, item.getItemId());
		
	}
	
	@Test 
	public void getItemName() {
		Item item = new Item(1, "joggers","comfy",10.0);
		assertEquals("joggers", item.getName());
		
	}

	@Test 
	public void getItemDescription() {
		Item item = new Item(1, "joggers","comfy",10.0);
		assertEquals("comfy", item.getDescription());
		
	}
	
	
	@Test 
	public void getItemPrice() {
		Item item = new Item(1, "joggers","comfy",10.0);
		assertEquals(10.0, item.getPrice());
		
	}
	
	
	

	
}
