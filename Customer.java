import java.util.*;
public class Customer {
   private  String name;
   private ShopingCart Cart;
   private Store In;

    public Customer(String name) {
        this.name = name;
    }

    public ShopingCart getCart() {
        return Cart;
    }

    public Store getIn() {
        return In;
    }

    public String getName() {
        return name;
    }

    public void setCart(ShopingCart Cart) {
        this.Cart = Cart;
    }

    public void setIn(Store In) {
        this.In = In;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String showInCart(){
    	String s="** shopping cart **";
    	for(int i=0;i<Cart.getCart().size();++i){
    		s+="\n"+Cart.getCart().get(i).getItemName()+"  ($"+
    			Cart.getCart().get(i).getPrice()+")";
    	}
    	return s;
    }
    
    
    
}
