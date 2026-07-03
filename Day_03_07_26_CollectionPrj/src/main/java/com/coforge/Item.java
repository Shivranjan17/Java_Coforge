package com.coforge;

public class Item implements Comparable<Item>{

		private String itemName;
		private int itemId;
		private double itemCost;
		public Item() {
		// TODO Auto-generated constructor stub
		}
		public Item(String itemName, int itemId, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.itemCost = itemCost;
		}
		public String getItemName() {
		return itemName;
		}
		public void setItemName(String itemName) {
		this.itemName = itemName;
		}
		public int getItemId() {
		return itemId;
		}
		public void setItemId(int itemId) {
		this.itemId = itemId;
		}
		public double getItemCost() {
		return itemCost;
		}
		public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
		}
		@Override
		public String toString() {
		return "Item [itemName=" + itemName + ", itemId=" + itemId + ", itemCost=" + itemCost + "]";
		}
//		@Override
//		public int compareTo(Item o) {
//			// TODO Auto-generated method stub
//			return (int)(o.getItemCost()-this.getItemCost());
//		}
//		METHOD 2
		@Override
		public int compareTo(Item o) {
			// TODO Auto-generated method s
			return this.getItemName().compareTo(o.getItemName());
		}
		
	

}
