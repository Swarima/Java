import com.zensar.emp.Employee;

public class Test3 {
public static void main(String[] args) {
	Employee e1,e2,e3;
	e1=new Employee();
	e2=new Employee();
	e3=new Employee();
	//e1.accept();
	//e1.display();
	e2=new Employee(3,"ashi",1000);
	//e2.display();
	//System.out.println(e2);
//String n=e2.getName();
//System.out.println(n);
	Employee.showCnt();

}
}