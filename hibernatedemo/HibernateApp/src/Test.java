
import java.util.*;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import snippet.Address;
import snippet.Laptop;

@Entity
class Employee1{
	@Id
	private int id;
	private String name;
	private double salary;
	@ManyToOne

	private Laptop l1; 
	public Laptop getL1() {
		return l1;
	}
	public void setL1(Laptop l1) {
		this.l1 = l1;
	}
	/*private List<Laptop> l1=new ArrayList<>();
	
	public List<Laptop> getL1() {
		return l1;
	}
	public void setL1(List<Laptop> l1) {
		this.l1 = l1;
	}*/
	/**private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;}**/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary /**+ ", address=" + address + "]"**/;
	}

}
//hibernate.cfg.xml
public class Test {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.setId(1);
		l1.setManufacture("dell");
		/*Laptop l2=new Laptop();
		l2.setId(2);
		l2.setManufacture("hp");*/
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();

		e1.setId(56976);
		e1.setName("Parul");
		e1.setSalary(5119);
		e1.setL1(l1); 
		
		e2.setId(56999);
		e2.setName("yasha");
		e2.setSalary(50987);
		e2.setL1(l1);
	

		//e1.getL1().add(l1);
		//e1.getL1().add(l2);
		
		/**Address address=new Address();
		address.setArea("hallaa"); 
		address.setCity("pune"); 
		e1.setAddress(address);**/

		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1);
		/**Query query=session.createQuery("from Employee1");
		List<Employee1> list=query.getResultList();**/
		session.save(l1);
		session.save(e2);
		session.getTransaction().commit();
		session.close();
		
		/**for(Employee1 e:list)
		{
			System.out.println(e);
		}**/
		
	}

}
