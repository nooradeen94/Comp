import javax.swing.*;
class Item{
    String itemname; 
    int itemid; 
    int Storeid;
    float Price;

    public Item(String itemname, int itemid, int Storeid, float Price) {  // constactor
        this.itemname = itemname;
        this.itemid = itemid;
        this.Storeid = Storeid;
        this.Price = Price;
    }

    public void DisplayItem(){ // display method
    JOptionPane.showMessageDialog(null,"Name of Item :"+itemname+"   "+"ID of Item :" +itemid+"  "+"Store id :"+Storeid+"   "+"Price  :"+Price);
       
    }
    
    public float getPrice() {
        return Price;
    }

    public int getStoreId() {
        return Storeid;
    }

    public int getItemId() {
        return itemid;
    }

    public String getItemName() {
        return itemname;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public void setStoreId(int Storeid) {
        this.Storeid = Storeid;
    }

    public void setItemId(int itemid) {
        this.itemid = itemid;
    }

    public void setItemName(String itemname) {
        this.itemname = itemname;
    }
    
    
    
}