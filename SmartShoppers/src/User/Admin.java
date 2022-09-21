package User;

import Other.Item;
import Other.Store;

public class Admin extends User {

	public Admin(String email, String password, String first, String last) {
		super(email, password, first, last);
		
		
	}
	
	public void addItem (Store store, String name, int itemID, String description, double price)
    {
    	Item item = new Item (itemID, name, description, price);
    	
    	store.addItem(item);
    	
    }
    
    public void removeItem (Store store, int ItemID)
    {
    	store.removeItem(ItemID);
    }
    

    
    public void addManager (String Fname,String Lname, String email, String password, Store store)
    {
    	Manager manager = new Manager (Fname, Lname, email, password, store);
    	
    	//Add manager to data base
    	
    	
    }
    
    public void removeManager (String email)
    {
    
    	//Remove manager to data base
    	
    	
    }

}
