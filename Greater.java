import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	int[] b=new int[5];
	int max=b[0];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			 while(b[i]>max)
		      {
		    	  max=b[i];
		    	 
		      }
		}
		 System.out.println(max);
      }
	}


