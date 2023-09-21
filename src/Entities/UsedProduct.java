package Entities;

import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	
//getters e setters
	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
//contrutores
	public UsedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
//métodos
	
	@Override
	public void priceTag() {
		System.out.println("Tipo: Usado");
		System.out.println("Nome:" + getName());
		System.out.println("Valor: R$ " + getPrice());
		System.out.println(manufactureDate);
	}
	
	
}
