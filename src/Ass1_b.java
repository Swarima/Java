import java.util.Scanner;
public class Ass1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] c;
		int[] b;
		int i;
		c=new int[5];
		b=new int[5];
		System.out.println("Enter");

		for(i=0;i<c.length;i++)
		c[i]=sc.nextInt();
	
		for(i=0;i<c.length;i++)
		{	b[i]=5*c[i];
			System.out.println(b[i]);
		}
	}
}