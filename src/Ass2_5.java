import java.util.Scanner;

class AccountHolder
{
	private long account_no;
	private String name;
	private double account_bal;
	
	public AccountHolder()
	{
		account_no = 56977;
		name="Yasha";
		account_bal = 5119; 
	}
	
	public AccountHolder(long acc_no, String n, double acc_bal)
	{
		account_no = acc_no;
		name=n;
		account_bal = acc_bal; 
	}
	
	public void setAccountNo(long acc_no)
	{
		account_no=acc_no;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setAccountBal(double acc_bal)
	{
		account_bal=acc_bal;
	}
	public long getAccountNo()
	{
		return account_no;
	}
	public String getName()
	{
		return name;
	}
	public double getAccountBal()
	{
		return account_bal;
	}
	public String toString()
	{
		return account_no+" "+name+" "+account_bal;
	}
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		account_no=sc.nextLong();
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the account balance:");
		account_bal=sc.nextDouble();
		System.out.println("Details added.");
	}
	public double deposit(double amt)
	{
		account_bal=account_bal+amt;
		return account_bal;
	}
	public double withdraw(double amt)
	{
		account_bal=account_bal-amt;
		return account_bal;
	}
}
public class Ass2_5 {
	public static void main(String[] args) {
		AccountHolder a[] = new AccountHolder[5];
		for(int i = 0; i < 5;i++)
			a[i]=new AccountHolder();
		Scanner sc=new Scanner(System.in);
		int choice,control=10;
		System.out.println(" For adding record: Enter 1 \n For displaying details of all account holder: Enter 2\n For depositing : Enter 3\n For withdrawing: Enter 4 \n For exit: Enter 5");
		
		while(control!=0)
		{
		choice = sc.nextInt();
		switch(choice)
		{
		case 1: a[4].insert();break;
		case 2: System.out.println("Details are:");
				for(int i = 0;i < a.length;i++)
					System.out.println(a[i]);break;
		case 3: long acc_no;
				double amt;
				System.out.println("Enter the account number of the holder:");
				acc_no=sc.nextInt();
				System.out.println("Enter the amount to deposit:");
				amt=sc.nextDouble();
				for(int i = 0;i<5;i++)
				{
					if(a[i].getAccountNo() == acc_no) { 
						System.out.println("The net Balance is "+a[i].deposit(amt));
					}
				}
				break;
		case 4: long acc_no1;
				double amt1;
				System.out.println("Enter the account number of the holder:");
				acc_no1=sc.nextInt();
				System.out.println("Enter the amount to withdraw:");
				amt1=sc.nextDouble();
				for(int i = 0;i<5;i++)
				{
					if(a[i].getAccountNo() == acc_no1) { 
						System.out.println("The net Balance is "+a[i].withdraw(amt1));
					}
				}
				break;
		case 5:System.exit(0);
		
		default: System.out.println("Enter valid option");
				 break;
		}
		control--;
	}
		
}
}


