package Other;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import User.Manager;

public class Store implements Serializable{

    private int location;
    private String [] timeOfOperation;
    private List<Item> inventory;
    private Manager manager;
    
    //Make getter and setter

    public Store (int location, String [] timeOfOperation, Manager manager)
    {
        this.location = location;
        this.timeOfOperation = timeOfOperation;
        this.manager = manager;
        this.inventory = new ArrayList<Item>();

    }
    public Store (int location, String [] timeOfOperation, Manager manager, List<Item>items)
    {
        this.location = location;
        this.timeOfOperation = timeOfOperation;
        this.manager = manager;
        this.inventory = items;
    }

    public void addItemToInvetory (String name, int quan, String des, double price, int ID ){
        //inventory.add(new Item(ID,name,quan,des,price));

    }
    
    
    public void removeItem (int id)
    {
        //databse get item by id
        //inventory.remove();//givenItembyid);
    }
    
    public void addItem (Item item)
    {
    	inventory.add(item);
    }
    
    public boolean isAvailable (int id)
    {
    	//return inventory.contains(/*ITEM*/);
    	return false;
    }
    
	public int getLocation() {
		return location;
	}
	public String getTimeOfOperation() {
		return timeOfOperation+"";
	}
	public List<Item> getInventory() {
		return inventory;
	}
	public String getManager() {
		return manager+"";
	}
	public void setTimeOfOperation(String[] timeOfOperation) {
		this.timeOfOperation = timeOfOperation;
	}
    
   
 }