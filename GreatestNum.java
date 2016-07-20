import java.util.Scanner;


public class GreatestNum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number a");
		  a=in.nextInt();
	
		System.out.println("Enter the number b");
		 b=in.nextInt();
		
		System.out.println("Enter the number c");
		 c=in.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
