public class Basic_20
{
	public static void main(String s[])
	{
		try
		{
			int x,y,z;
			x=Integer.parseInt(s[0]);
			y=Integer.parseInt(s[1]);
			z=x/y;
			System.out.println("Z = "+z);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}

















