final class a
{
int x=10,y=20;
 void add()
{System.out.println(x/y);}
}
class b extends a
{
	void add()
	{System.out.println(x/y);}
public static void main(String args[])
{b z=new b();
z.add();
z.add();
}
}