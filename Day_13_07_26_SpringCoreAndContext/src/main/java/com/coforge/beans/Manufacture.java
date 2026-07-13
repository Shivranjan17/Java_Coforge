package com.coforge.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("man")
public class Manufacture {
//	@Value("7654")
	@Value("${Manufacture.mid}")
	private int mid;
//	@Value("ABC")
	@Value("${Manufacture.company}")
	private String company;
//	@Value("Chennai")
	@Value("${Manufacture.address}")
	private String address;
		public Manufacture() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Manufacture(int mid, String company, String address) {
			super();
			this.mid = mid;
			this.company = company;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Manufacture [mid=" + mid + ", company=" + company + ", address=" + address + "]";
		}
		public int getMid() {
			return mid;
		}
		public void setMid(int mid) {
			this.mid = mid;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
