import java.util.Scanner;

//import com.zensar.emp.Employee;
class Employee{
	private int empid;
	private String name;
    private double salary;
    private static int cnt;
    
    static
    {
    	cnt=0;
    }
    public Employee()
    {
    	cnt++; //to count no of objects
    }
    public Employee(int id,String n,double s)
    {
    	empid=id;
    	name=n;
    	salary=s;
    }
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("empid, name and salary");
		empid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
	}
	public void display()
	{
		System.out.println(empid+" "+name+" "+salary);;
	}
	
	public String toString() {
		return empid+ " "+name+" "+salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public static void showCnt()
	{
		System.out.println("no of objects " +cnt);

	}
}
	
	public class Test2 {
		public static void main(String[] args) {
			Employee e1,e2,e3,e4;
			e1=new Employee();
			e2=new Employee();
			e3=new Employee();
			//e1.accept();
			//e1.display();
			e4=new Employee(3,"ashi",1000);
			//e2.display();
			//System.out.println(e2);
		//String n=e2.getName();
		//System.out.println(n);
			Employee.showCnt();

		}
		}


