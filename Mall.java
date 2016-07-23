import javax.swing.*;
import java.util.*;

public class Mall {
 String MName;
 ArrayList<Store> StoresInMall=new ArrayList<Store>();
 ArrayList<Customer> CustomersInMall=new ArrayList<Customer>();

  public Mall(String MName) {
        this.MName = MName;
    }
  public ArrayList<Customer> getCustomersInMall() {
        return CustomersInMall;
    }
  public ArrayList<Store> getStoresInMall() {
        return StoresInMall;
    } 
  public void enterMall(Customer c){
    CustomersInMall.add(c);
    c.setCart(getShopingCart());
}
  public void ExitMall(Customer c){
    JOptionPane.showMessageDialog(null,c.showInCart());
    CheckOut(c.getCart());
    CustomersInMall.remove(c);
}
  public ShopingCart getShopingCart(){
    return new ShopingCart();
}
  public void CheckOut(ShopingCart Cart){
    double pay=0.0;
    for(int i=0;i<Cart.getCart().size();i++){
     pay+=Cart.itemsInCart.get(i).getPrice();    
    }
    JOptionPane.showMessageDialog(null,"your payment is :  "+pay+"$");
}
}
