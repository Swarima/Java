package snippet;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String area,city;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

}
