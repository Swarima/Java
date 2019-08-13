import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import com.zensar.Vehicle;

public class TestFour {
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		Vector<Vehicle> vector=new Vector<Vehicle>();
		int ch=0;
		while(true)
		{
			System.out.println("Choose an option");
			System.out.println("Choose 1 for inserting");
			System.out.println("Choose 2 for Updating");
			System.out.println("Choose 3 for displaying");
			System.out.println("Choose 4 to exit");
			ch=scanner.nextInt();
		  switch (ch) 
		  {
			case 1:
			{
				String temp= " ";
				String temp1="";
				double temp2=0;
				System.out.println("Enter registration number,vehicle name and vehicle cost");
				temp=scanner.next();
				temp1= scanner.next();
				temp2=scanner.nextDouble();
				
				Vehicle vehicle=new Vehicle(temp,temp1,temp2);
				vector.add(vehicle);
				break;
			}
			case 2:
			{
				System.out.println("Enter registration number");
				
				String temp=scanner.next();
				
				for (Vehicle vehicle : vector) {
					
					if(vehicle.getVehicle_registration_number().equals(temp))
					{
						System.out.println("Enter vehicle name and vehicle cost to update");
						String temp1=scanner.next();
						Double temp2=scanner.nextDouble();
						vehicle.setVehicle_name(temp1);
						vehicle.setCost_of_Vehicle(temp2);
					}
				}
				break;
			}
			case 3:
			{
				Iterator<Vehicle> iterator=vector.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next()+" "+iterator.toString());
				}
					break;
			}
			case 4:
			{
				System.exit(0);
			}
			default :
			{
				System.out.println("Invalid choice");
			}
		  }
		}
	}
}
