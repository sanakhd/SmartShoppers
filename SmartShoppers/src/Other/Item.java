package Other;

import java.io.Serializable;

public class Item implements Serializable{
	
	public int itemId;
	public String name;

	public String description;
	public double price;
	
	
	public Item(int itemId, String name, String description, double price ) {
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
