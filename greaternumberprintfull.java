package set1;


import java.util.Scanner;

public class greaternumberprintfull {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int [n];
			int m=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]<a[j])
					{
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
				}
			}
			
			for(int k=0;k<n;k++){
				m=(m*10)+a[k];
				}
			System.out.print(m);
			}
				
	}
}
