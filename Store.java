import javax.swing.*;
import java.util.*;
abstract  class Store{
public abstract void Enter(Customer K);
public abstract void Exite(Customer K);
public abstract void addToCart(ShopingCart cartM,Item H);
public abstract void RemoveFromCart(ShopingCart cartM,Item H);


private String Storename;
private int Storeid;
ArrayList<Item> StoreItems=new ArrayList<Item>();
ArrayList<Customer> CustomerInStore=new ArrayList<Customer>();

public String showItems(){
		String s="1."+StoreItems.get(0).itemname+"\n";
		 s+="2."+StoreItems.get(1).itemname+"\n";
		 s+="3."+StoreItems.get(2).itemname+"\n";
		 s+="4."+StoreItems.get(3).itemname+"\n";
		 s+="5."+StoreItems.get(4).itemname+"\n";
		 return s;
}
public void setStoreId(int Storeid) {
        this.Storeid = Storeid;
    }
public void setStoreName(String Storename) {
        this.Storename = Storename;
    }
public int getStoreId() {
        return Storeid;
    }
public ArrayList<Item> getStoreItems() {
        return StoreItems;
    }
public String getStoreName() {
        return Storename;
    }
public ArrayList<Customer> getCustomerInStore() {
        return CustomerInStore;
    }

    
    
    
   



}
