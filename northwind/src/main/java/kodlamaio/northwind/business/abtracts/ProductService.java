package kodlamaio.northwind.business.abtracts;

import java.util.List;

import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();

	Result add(Product product);
}
