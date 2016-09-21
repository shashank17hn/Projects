package firstLesson.dto;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehical {

	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}

	
	
}
