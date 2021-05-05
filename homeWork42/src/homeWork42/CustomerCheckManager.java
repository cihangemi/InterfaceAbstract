package homeWork42;

import Entities.Customer;
import homeWork42.Abstract.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
