import javax.swing.*;
import java.io.*;
public class Test {
public static void main(String args[]){
	
	
	Store store;
    String mallName= "Al-NOUR Mall";
    Mall M=new Mall(mallName);
    M.StoresInMall.add(new BookStore()); 
    M.StoresInMall.add(new GameStore());
    M.StoresInMall.add(new ShoeStore()); 
  
    String Cname=JOptionPane.showInputDialog(null,"Enter the name of Customer : " );
    Customer C=new Customer(Cname);
    	 M.enterMall(C);
    	 
    	JOptionPane.showMessageDialog(null,"Welcome to  "+mallName);
    do{
    	try{
    	
    	
    String s5=JOptionPane.showInputDialog(null,"1-book Store \n2-Game Store \n3-Shoe Store \n5-To casher:");
    int z=Integer.parseInt(s5);
    switch(z){
    case 1:
    		store=M.StoresInMall.get(0);
    		store.Enter(C);
    		JOptionPane.showMessageDialog(null,"BOOK SHOP");
            String s3 =JOptionPane.showInputDialog(null,store.showItems()+"\nChoose book ");
            int book=Integer.parseInt(s3);
            store.addToCart(C.getCart(),store.StoreItems.get(book-1));
              
           JOptionPane.showMessageDialog(null,Cname+" Exit book shop");
           store.Exite(C);
    break;
    case 2:
    		store=M.StoresInMall.get(1);
    		store.Enter(C);
    		JOptionPane.showMessageDialog(null,"GAME SHOP");
    	    String s6 =JOptionPane.showInputDialog(null,store.showItems()+"\nChoose Game ");
    	    int game=Integer.parseInt(s6);
            store.addToCart(C.getCart(),store.StoreItems.get(game-1));
  
           JOptionPane.showMessageDialog(null,Cname+"Exit Game shop");
           store.Exite(C);
    break;
    case 3 :
    	  store=M.StoresInMall.get(2);
    	  store.Enter(C);
    	  JOptionPane.showMessageDialog(null,"SHOE SHOP");
    	  String s8 =JOptionPane.showInputDialog(null,store.showItems()+"\nChoose Shoe ");
          int shoe=Integer.parseInt(s8);
          store.addToCart(C.getCart(),store.StoreItems.get(shoe-1));
               
         JOptionPane.showMessageDialog(null,Cname +" Exit shoe shop");
         store.Exite(C);
    break;
    case 5:
    	
    	 M.ExitMall(C);
    	 System.exit(0);
    }
    	}catch(Exception InputMismatchException){
    	
    	}
    }while(true);
 
 

}
}
