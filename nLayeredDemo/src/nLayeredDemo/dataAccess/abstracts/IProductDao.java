package nLayeredDemo.dataAccess.abstracts;

import java.util.List;
import nLayeredDemo.entities.concretes.Product;

public interface IProductDao {
	void Add(Product product);
	
	void Update(Product product);
	
	void Delete(Product product);
	
	Product get(int Id);
	
	List<Product> getAll();

}
