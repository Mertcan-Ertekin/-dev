package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.IEntitiy;

public class Product implements IEntitiy {
	private int Id;
	private int CategoryId;
	private String Name;
	private double unitPrice;
	private int UnitsInStock;
	
	public Product() {
		
	}

	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
		super();
		Id = id;
		CategoryId = categoryId;
		Name = name;
		this.unitPrice = unitPrice;
		UnitsInStock = unitsInStock;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return UnitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		UnitsInStock = unitsInStock;
	}

}
