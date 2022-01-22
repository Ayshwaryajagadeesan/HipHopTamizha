package com.example.jagadeesan.hiphoptamizha;
import android.app.FragmentManager;
import android.content.res.Resources;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ShoppingCartHelper {
	
	public static final String PRODUCT_INDEX = "PRODUCT_INDEX";
	private static List<Shoe> catalog;
	private static List<Shoe> catalog1;
	private static List<Shoe> catalog2;
	private static Map<Shoe, ShoppingCartEntry> cartMap = new HashMap<Shoe, ShoppingCartEntry>();
	public static int quantity1;
    FragmentManager mFragmentManager;
    public static List<Shoe> getCatalog(Resources res){
		if(catalog == null) {
			catalog = new Vector<Shoe>();
			catalog.add(new Shoe("Mobile Cover Iphone6",
					"http://millsoft1.esy.es/app/mobile2.jpg",740));
			catalog.add(new Shoe("Mobile Cover Motorola",
					"http://millsoft1.esy.es/app/mobile3.jpg",799));
			catalog.add(new Shoe("Mobile Cover Xiaomi MI3",
					"http://millsoft1.esy.es/app/mobile4.jpg",750));
			catalog.add(new Shoe("Mobile Cover I phone 6 plus",
					"http://millsoft1.esy.es/app/mobile.jpg",740));
			catalog.add(new Shoe("Tamizhanda Legacy",
					"http://millsoft1.esy.es/app/tamilanda.jpg",499));
			catalog.add(new Shoe("Tamizhanda Ever Since",
					"http://millsoft1.esy.es/app/tshirt2.jpg",499));
			catalog.add(new Shoe("Helluva being",
					"http://millsoft1.esy.es/app/tshirt3.jpg",499));
			catalog.add(new Shoe("Pacha tamizhanda",
					"http://millsoft1.esy.es/app/tshirt4.jpg",550));
		}
		return catalog;
	}
	public static List<Shoe> getCatalog1(Resources res){
		if(catalog1 == null) {
			catalog1 = new Vector<Shoe>();
					catalog1.add(new Shoe("Tamizhanda Legacy",
					"http://millsoft1.esy.es/app/tamilanda.jpg",499));
			catalog1.add(new Shoe("Tamizhanda Ever Since",
					"http://millsoft1.esy.es/app/tshirt2.jpg",499));
			catalog1.add(new Shoe("Helluva being",
					"http://millsoft1.esy.es/app/tshirt3.jpg",499));
			catalog1.add(new Shoe("Pacha tamizhanda",
					"http://millsoft1.esy.es/app/tshirt4.jpg",550));
		}
		return catalog1;
	}
	public static List<Shoe> getCatalog2(Resources res){
		if(catalog2 == null) {
			catalog2 = new Vector<Shoe>();
			catalog2.add(new Shoe("Mobile Cover Iphone6",
					"http://millsoft1.esy.es/app/mobile2.jpg",740));
			catalog2.add(new Shoe("Mobile Cover Motorola",
					"http://millsoft1.esy.es/app/mobile3.jpg",799));
			catalog2.add(new Shoe("Mobile Cover Xiaomi MI3",
					"http://millsoft1.esy.es/app/mobile4.jpg",750));
			catalog2.add(new Shoe("Mobile Cover I phone 6 plus",
					"http://millsoft1.esy.es/app/mobile.jpg",740));
		}
		return catalog2;
	}
	public static void setQuantity(Shoe product, int quantity) {
		ShoppingCartEntry curEntry = cartMap.get(product);
		if(quantity <= 0) {
			if(curEntry != null)
				removeProduct(product);
			return;
		}
		if(curEntry == null) {
			curEntry = new ShoppingCartEntry(product, quantity);
			cartMap.put(product, curEntry);
			return;
		}
    }
	
	public static int getProductQuantity(Shoe product) {
		ShoppingCartEntry curEntry = cartMap.get(product);
		if(curEntry != null)
			return curEntry.getQuantity();
  	return 0;
	}
	
	public static void removeProduct(Shoe product) {
		cartMap.remove(product);
	}
	
	public static List<Shoe> getCartList() {
		List<Shoe> cartList = new Vector<Shoe>(cartMap.keySet().size());
		for(Shoe p : cartMap.keySet()) {
			cartList.add(p);
		}
		return cartList;
	}
}
