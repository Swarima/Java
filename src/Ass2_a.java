import java.util.Scanner;
public class Ass2_a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]c=new int[3][3];
		int [][]b=new int[3][3];

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


		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++)
			{
		
				System.out.print( " "+(c[i][j]+b[i][j]));
				}
			System.out.println();
			}
		System.out.println();


	}

}
