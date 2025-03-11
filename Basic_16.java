class A
{
	int x;
	static int y;
	public void show()
	{
		System.out.println("X = " +x + ", Y = " +y);
	}
	public A(int p1,int p2)
	{
		x=p1;
		y=p2;
	}
	
}
public class Basic_16
{
	public static void main(String s[]) 
	{
		A ob1 = new A(100,200);
		ob1.show();
		A ob2 = new A(300,400);
		ob2.show();
		ob1.show();
	}
}















