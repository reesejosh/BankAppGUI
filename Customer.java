public class Customer
{
    private String firstName;
    private String lastName;
    private String ssn;
    private Account account; 
    public Customer(String firstName, String lastName, String ssn, Account account)
    {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ssn = ssn;
            this.account = account;
    }
    @Override
    public String toString()
    {
            return "\nCustomer Information\n" + "First Name: " + getFirstName() + "\n" + "Last Name:" + getLastName() + "\n" + "SSN:"
                            + ssn + "\n" + account;
    }
    public Account getAccount()
    {
        return account;
    }


    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
   
    public String basicInfo()
    {
            return "First Name:" + getFirstName() + " Last Name:" + getLastName() + " SSN:" + ssn + " Account Number: "
                            + account.getAccountNumber();
    }

		

}
