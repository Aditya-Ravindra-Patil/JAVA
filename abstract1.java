abstract class a 
{
	int a=10,b=20,c;
abstract void add();
void dis()
{
	System.out.println(c);	
}

}

class b extends a
{
void add()
{
c=a+b;
System.out.println("A");
}
}
class abstract1
{
public static void main(String args[])
{
b x=new b();
x.add();
x.dis();
}
}