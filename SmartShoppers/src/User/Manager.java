package User;

import Other.Item;
import Other.Store;

public class Manager extends User{
    private Store store;


    public Manager (String first, String last, String email, String password, Store store)
    {
        super (email,password, first, last);
        this.store = store; 

    }
    
    public void addItem (String name, int itemID, String description, double price)
    {
    	Item item = new Item (itemID, name, description, price);
    	
    	store.addItem(item);
    	
    }
    
    public void removeItem (int ItemID)
    {
    	store.removeItem(ItemID);
    }
    
    public void updateStoreHours (String start, String end)
    {
    	String [] hours = {start,end};
    	
    	store.setTimeOfOperation(hours);
    }

    


}