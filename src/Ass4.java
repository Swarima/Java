import java.util.Scanner;
public class Ass4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int i=0;
		int temp=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int []c=new int[n];
		
		System.out.println("Enter the elements");
		for( i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
			//System.out.print(c[i]+" ");
		}
		int k=n-1;
		for(int j=0;j<(n/2);j++)
		{
			temp=c[j];
			c[j]=c[k];
			c[k]=temp;
			k--;
			
		}
		for(i=0;i<n;i++)
			System.out.print(c[i]+" ");
	}

}
