package User;

import java.io.Serializable;
import java.util.ArrayList;

import Other.Store;
import Other.Cart;

public class Customer extends User implements Serializable{
    private Cart myCart;
    private int location;

    public Customer (String first, String last, String email, String password)
    {
        super (email,password, first, last);
        myCart = new Cart(this);
        location = 0;

    }
    public Customer (String first, String last, String email, String password, Cart cart, int location)
    {
        super (email,password, first, last);
        myCart = new Cart(this);
        this.location = location;
    }

    public int getLocation ()
    {
        return location;
    }

    public void setLocation (int location)
    {
        this.location = location;
    }

    public void addToCart (int itemID)
    {
        
        
    }

    public void removeFromCart (int itemID)
    {
        myCart.removeItem(itemID);
    }

    public String viewCart ()
    {
        return myCart.toString();
    }

    public Store findNearestStore (){
        //Databse get list of stores
        ArrayList  <Store> stores = new ArrayList<Store>();
        Store closest = stores.get(0);
        for (int i = 1; i < stores.size(); i++)
        {
            if (stores.get(i).getLocation()-location < closest.getLocation()-location)
            {
                closest = stores.get(i);
            }
     
        }

        return closest;
    } 

}