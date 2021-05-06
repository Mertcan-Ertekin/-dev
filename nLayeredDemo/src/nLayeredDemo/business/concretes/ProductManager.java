package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abtracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements IProductService {
    
	private ILoggerService loggerService;
	private IProductDao productDao;
	
	public ProductManager(IProductDao productDao, ILoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void Add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor. ");
			return;
		}
		this.productDao.Add(product);

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
