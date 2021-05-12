package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "product_Id")
	private int Id;
	
	@Column(name = "category_Id")
	private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unıt_price")
	private double unitPrice;
	
	@Column(name = "unıt_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnıt;
	
	public Product() { 
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnıt) {
		super();
		Id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnıt = quantityPerUnıt;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the unitsInStock
	 */
	public short getUnitsInStock() {
		return unitsInStock;
	}

	/**
	 * @param unitsInStock the unitsInStock to set
	 */
	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	/**
	 * @return the quantityPerUnıt
	 */
	public String getQuantityPerUnıt() {
		return quantityPerUnıt;
	}

	/**
	 * @param quantityPerUnıt the quantityPerUnıt to set
	 */
	public void setQuantityPerUnıt(String quantityPerUnıt) {
		this.quantityPerUnıt = quantityPerUnıt;
	}

}
