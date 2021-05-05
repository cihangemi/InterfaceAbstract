package homeWork42;

import Entities.Customer;
import homeWork42.Abstract.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService {
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Veritaban�na eklendi : " + customer.getFirstName());
		}

		else {
			System.out.println("Ge�erli kullan�c� de�il");
		}

	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
