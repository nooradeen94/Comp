class BookStore extends Store{
	{
		StoreItems.add(new Item("Java",1,1,25));
		StoreItems.add(new Item("PhP",2,1,30));
		StoreItems.add(new Item("C",3,1,15));
		StoreItems.add(new Item("animal",4,1,10));
		StoreItems.add(new Item("Famialy",5,1,20));		
		setStoreName("BookStore");
		setStoreId(1);
	}
public  void Enter(Customer K){
CustomerInStore.add(K);
}
public  void Exite(Customer K){
CustomerInStore.remove(K);
}
public  void addToCart(ShopingCart cartM,Item H){
cartM.itemsInCart.add(H);
}
public  void RemoveFromCart(ShopingCart cartM,Item H){
cartM.itemsInCart.remove(H);
}

}
class GameStore extends Store{		
	{
		StoreItems.add(new Item("Car",1,2,15));
		StoreItems.add(new Item("Cartoon",2,2,10));
		StoreItems.add(new Item("Game 1",3,2,22));
		StoreItems.add(new Item("Mario",4,2,13));
		StoreItems.add(new Item("Actoin",5,2,20));
		setStoreName("GameStore");
		setStoreId(2);
	}
public  void Enter(Customer K){
CustomerInStore.add(K);
}
public  void Exite(Customer K){
CustomerInStore.remove(K);
}
public  void addToCart(ShopingCart cartM,Item H){
cartM.itemsInCart.add(H);
}
public  void RemoveFromCart(ShopingCart cartM,Item H){
cartM.itemsInCart.remove(H);
}

}
class ShoeStore extends Store{		
	{
		StoreItems.add(new Item("man shoes",1,3,20));
		StoreItems.add(new Item("baby shoes",2,3,10));
		StoreItems.add(new Item("woman shoes",3,3,15));
		StoreItems.add(new Item("Boy shoes",4,3,10));
		StoreItems.add(new Item("Old man shoes",5,3,20));
		setStoreName("ShoeStore");
		setStoreId(3);
	}
public  void Enter(Customer K){
CustomerInStore.add(K);
}
public  void Exite(Customer K){
CustomerInStore.remove(K);
}
public  void addToCart(ShopingCart cartM,Item H){
cartM.itemsInCart.add(H);
}
public  void RemoveFromCart(ShopingCart cartM,Item H){
cartM.itemsInCart.remove(H);
}
}
