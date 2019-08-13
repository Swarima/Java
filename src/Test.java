import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int [][]c;
c=new int[3][];
c[0]=new int[4];
c[1]=new int[3];
c[2]=new int[2];
System.out.println("Enter");
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++) {
		c[i][j]=sc.nextInt();
	}
}
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++) {
		System.out.println(c[i][j] +" ");
}
	System.out.println();

}

	}
}
