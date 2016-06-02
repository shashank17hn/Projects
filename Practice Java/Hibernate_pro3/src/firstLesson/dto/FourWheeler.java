package firstLesson.dto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehical{
	
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

	
}
