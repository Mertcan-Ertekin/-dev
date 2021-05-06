package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements IProductDao {

	@Override
	public void Add(Product product) {
		System.out.println("Hibernate ile eklendi "+ product.getName());
		
	}

	@Override
	public void Update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
