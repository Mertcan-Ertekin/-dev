package nLayeredDemo.business.abtracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface IProductService {
	void Add(Product product);
	
	List<Product> getAll();
	
	

}
