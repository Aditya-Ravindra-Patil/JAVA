abstract class a
{
abstract void add();
void a()
{
System.out.println("this is constructor");	
}
}
class abstract3 extends a
{
	
void add()
{
System.out.println("hii");
}


}
class abstract2
{
public static void main(String args[])
{
abstract3 x=new abstract3();
final int i=6;
System.out.println(i);

x.add();

}
}