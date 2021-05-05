

import Adapter.MernisServiceAdapter;
import Entities.Customer;
import homeWork42.BaseCustomerManager;
import homeWork42.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "AY�E", "GEM�", 1982, "40279104962"));

	}

}
