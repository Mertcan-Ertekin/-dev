package kodlamaio.northwind.business.abtracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;

public interface UserService {
	Result add(User user);
    DataResult<User> findByEmail(String email);

}
