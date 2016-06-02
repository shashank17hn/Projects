package notify_Users;

public class main_Notify {

	public static void main(String[] args) {
		
		Customer CustomerA = new Customer();
		Customer CustomerB = new Customer();
		
		CustomerA.setCustomerName("Mr. A");
		CustomerB.setCustomerName("Mr. B");
		
		Product pro = new Product();
		pro.setAvailability(false);
		
		pro.setProductName("S6 Edge");
		pro.register(CustomerA);
		pro.register(CustomerB);
		
		pro.setAvailability(true);
		
		System.out.println("== Custumer A unsubscribe ==");
		
		pro.remove(CustomerA);
		
		pro.setAvailability(true);

	}

}
