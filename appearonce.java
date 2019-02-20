import java.util.Scanner;

public class appearonce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
			int a[] = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(a[i]!=a[j])
					{
						c=1;
					}
					else
					{
						c=0;
						break;
					}
				}
			}
		if(c==1)
		{
		System.out.print(a[i]);
		}
		}
	}

}
