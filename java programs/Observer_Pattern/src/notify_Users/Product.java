package notify_Users;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private List<Observer> listofobs = new ArrayList<Observer>();
	
	public boolean availability;
	public String ProductName;
	
	
	public List<Observer> getListofobs() {
		return listofobs;
	}

	public void setListofobs(List<Observer> listofobs) {
		this.listofobs = listofobs;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		
		this.availability = availability;
		if(availability == true)
		{
			notifyObservers();
		}
	}

	@Override
	public void register(Observer observer) {
		
		listofobs.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {

		listofobs.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		System.out.println("******** Notification ********");
		for(Observer obs : listofobs)
		{
			obs.update(ProductName);
		}
		
	}

}
