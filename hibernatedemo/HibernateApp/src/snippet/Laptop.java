package snippet;

import javax.persistence.*;
@Entity
public class Laptop {
	@Id
	private int id;
	private String manufacture;
	

	//private Employee1 e;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", manufacture=" + manufacture + "]";
	}

}
