package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Medicine {

	@Id
	@Column
	private int Serial_no;
	@Column
	private String Name;
	@Column
	private String Date_of_expire;
	@Column
	private int Price;
	@Column
	private int Quantity;
	
	public Medicine()
	{
		
	}
	
	public Medicine(int serial_no, String name, String date_of_expire, int price, int quantity) {
		super();
		Serial_no = serial_no;
		Name = name;
		Date_of_expire = date_of_expire;
		Price = price;
		Quantity = quantity;
	}
	public int getSerial_no() {
		return Serial_no;
	}
	public void setSerial_no(int serial_no) {
		Serial_no = serial_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate_of_expire() {
		return Date_of_expire;
	}
	public void setDate_of_expire(String date_of_expire) {
		Date_of_expire = date_of_expire;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}
