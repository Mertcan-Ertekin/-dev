package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int Id;
	
	//@Column(name = "category_id")
	//private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "unit_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnıt;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;


}
