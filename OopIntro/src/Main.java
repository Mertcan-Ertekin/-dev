
public class Main {
	
	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo V17");
		product1.setDetail("32 GB Ram");
		product1.setDiscount(20);
		product1.setUnitPrice(14000);


		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);

	
		Product[] products = {product1, product2};
		for (Product product : products) {
			System.out.println(product.getId()+" "+ product.getDetail());
		}
		
	    System.out.println("Ürün sayýsý");
		System.out.println(products.length);
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		


	}

}
