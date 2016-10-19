package firstLesson.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 // @DiscriminatorColumn(name = "Vehical_Type", discriminatorType = DiscriminatorType.STRING) 
//used when Single table is used to dintinguish 
public class Vehical {
@Id @GeneratedValue
private int vehical_Id;
private String vehical_name;


public int getVehical_Id() {
	return vehical_Id;
}
public void setVehical_Id(int vehical_Id) {
	this.vehical_Id = vehical_Id;
}
public String getVehical_name() {
	return vehical_name;
}
public void setVehical_name(String vehical_name) {
	this.vehical_name = vehical_name;
}

	
}
