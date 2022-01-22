package com.example.jagadeesan.hiphoptamizha;

public class ShoppingCartEntry {
	
	private Shoe mProduct;
	private int mQuantity;
	
	public ShoppingCartEntry(Shoe product, int quantity) {
		mProduct = product;
		mQuantity = quantity;
	}
	
	public Shoe getProduct() {
		return mProduct;
	}
	
	public int getQuantity() {
		return mQuantity;
	}
	
	public void setQuantity(int quantity) {
		mQuantity = quantity;
	}

}
