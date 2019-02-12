import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
 int k=sc.nextInt();
int total=0,count;
for(count=1;count<=k;count++)
{
	total=total+count;
}
System.out.println(total);

	}


}
