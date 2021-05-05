package homeWork42;

import Entities.Customer;
import homeWork42.Abstract.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Savetodb" + customer.getFirstName());

	}

}
