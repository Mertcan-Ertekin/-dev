
public class Product {
	private int Id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Product() {
		
	}
	
    public Product (int Id, String name, double unitPrice,
        String detail, double discount) {
    	super();
    	this.Id = Id;
    	this.name = name;
    	this.unitPrice = unitPrice;
    	this.detail = detail;
    	this.discount = discount;
		
	}
    
}
