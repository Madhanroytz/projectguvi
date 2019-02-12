
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String n=sc.next();
     String rev="";
     int len=n.length();
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+n.charAt(i);
     }
     
     System.out.println(rev);
	}

}
