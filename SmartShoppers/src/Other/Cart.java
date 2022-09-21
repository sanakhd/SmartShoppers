package Other;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import User.Customer;

public class Cart implements Serializable{
	
	HashMap<Item, Integer> map;
	List<Item> cart;
	Customer customer;
	
	
	public Cart(Customer customer) {
		this.map = new HashMap<Item, Integer>() ;
		this.cart =  new ArrayList <Item>();
		this.customer = customer;
	}


	public HashMap<Item, Integer> getMap() {
		return map;
	}


	public void setMap(HashMap<Item, Integer> map) {
		this.map = map;
	}


	public List<Item> getCart() {
		return cart;
	}


	public void setCart(List<Item> cart) {
		this.cart = cart;
	}


	
	public void addItem(Item item) {
		

		
		if(cart.contains(item)) {
			map.put(item, map.get(item) + 1);
			
		} else {
			map.put(item, 1);
			cart.add(item);
			
		}
		
	}
	
	public boolean removeItem(int itemId) {
		Item tempItem = new Item();
		cart.remove(tempItem);
		
		if(cart.contains(tempItem)) {
			if(map.get(tempItem) >= 1 ) {
				map.put(tempItem, map.get(tempItem) - 1);
				return true;
			}else if(map.get(tempItem) == 1) {
				map.remove(tempItem);
				cart.remove(itemId);
				return true;
			}
		}
		return false;
	}
	
	public double cartPrice() {
		double total = 0;
		
		for(int i = 0; i < cart.size(); i++) {
			total = total + cart.get(i).getPrice() * map.get(cart.get(i));
		}
		return total;
	}
	
	public void cartSize() {
		cart.size();
	}
	

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String toString ()
	{
		String str = "YOUR CART\n===========\n";
		
		for (int i = 0; i < cart.size(); i ++) {
			str = str + "\n" + (i+1) + ". " + cart.get(i).getName() + "\n Quantity: " + map.get(cart.get(i));
			str = str + "\n Total Price: " + map.get(cart.get(i))* cart.get(i).price + "\n";
			
			
		}
		str = str + "\n Total Cart Price: " + cartPrice() + "\n"; 
		
		
		return str;
	}
	
}
