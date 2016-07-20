
public class PosOrNeg
{

	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		if(num==0)
		{
			System.out.println("Number is zero");
		}
		else if(num>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}

}
