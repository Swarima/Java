import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int [][]c=new int[3][3];
		int [][]b=new int[3][3];
		int [][]a=new int[3][3];


		System.out.println("Enter the elements");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++)
			{
			
				c[i][j]=sc.nextInt();
		}
			}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++)
			{				
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();

		}
		System.out.println();
		
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++)
			{				
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();

		}
		System.out.println();
		for(int i=0;i<c.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<b.length;k++)
				{
					a[i][j]=c[i][j]+(c[i][j]*b[i][j]);
					System.out.print( a[i][j]+ " ");
		}
			}
			System.out.println();
			}
		System.out.println();



	}

}
