import java.util.Scanner;

public class Vowelarenot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    	char ch=sc.next().charAt(0);
if((ch=='a'||ch=='e'||ch=='e'||ch=='e'||ch=='e')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
{
	System.out.println("vowels");
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
	System.out.println("Consonant");
}
else
{
	System.out.println("invalid");
}
	}
}

