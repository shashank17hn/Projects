package notify_Users;

public class Customer implements Observer{

    public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	String CustomerName; 	
	@Override
	public void update(String Productname) {
		
		System.out.println("Hello " + CustomerName+ " , " + Productname + " is available now");
		
	}

}
