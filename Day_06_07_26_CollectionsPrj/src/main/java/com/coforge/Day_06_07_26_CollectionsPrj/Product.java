package com.coforge.Day_06_07_26_CollectionsPrj;

public class Product implements Comparable<Product>{
	private int prodId;
	private String prodCost;
	private String prodName;
	private int nou;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCost() {
		return prodCost;
	}
	public void setProdCost(String prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getNou() {
		return nou;
	}
	public void setNou(int nou) {
		this.nou = nou;
	}
	public Product(int prodId, String prodCost, String prodName, int nou) {
		super();
		this.prodId = prodId;
		this.prodCost = prodCost;
		this.prodName = prodName;
		this.nou = nou;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCost=" + prodCost + ", prodName=" + prodName + ", nou=" + nou + "]";
	}
	@Override
    public int compareTo(Product o) {
        return this.getProdName().compareTo(o.getProdName());
    }
	

}
