package nLayeredDemo;

import nLayeredDemo.business.abtracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		IProductService productService = new ProductManager(new AbcProductDao(), new ILoggerService() {
			
			@Override
			public void LogToSystem(String message) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.Add(product);

	}

}
