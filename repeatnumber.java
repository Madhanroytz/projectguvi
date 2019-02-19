import java.util.Scanner;

public class repeatnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int v=0;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int k=i+1;k<n;k++)
	{
		v=1;
		if(a[i]==a[k])
		{
			System.out.println(a[i]);
		}
	}
	if(v==0)
	{
		System.out.println("unique");
	}
}

	}

}
