import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Bank
{
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	public Customer getCustomer(int account)
	{
		return customers.get(account);
	}
	ArrayList<Customer> getCustomers()
	{
		return customers;
	}
        public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    Customer getCustomerByAccountNumber(int accountNumber)
    {
        Customer customer = null;
        for(Customer c : customers){
            if(c.getAccount().getAccountNumber() == accountNumber){
                customer = c;
                break;
            }
        }
        return customer;
    }

    void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }
}
