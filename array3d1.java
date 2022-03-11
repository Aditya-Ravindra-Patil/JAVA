import java.util.*;
class array3d1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int a[][][]=new int[2][2][3];
int b[][][]=new int[2][2][3];
int i,j,k,z;

System.out.println("Enter A Array element: ");

for(k=0;k<2;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
a[k][i][j]=sc.nextInt();
}

}

}


System.out.println("A matrix is:");
for(k=0;k<2;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
System.out.print("\t"+a[k][i][j]);
}
System.out.println();

}
System.out.println("\n");

}

System.out.println("Enter B Array element: ");

for(k=0;k<2;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
b[k][i][j]=sc.nextInt();
}

}

}

System.out.println("B matrix is:");
for(k=0;k<2;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
System.out.print("\t"+b[k][i][j]);
}
System.out.println();

}
System.out.println("\n");

}

System.out.println("Addition of array A and Array B is :");
for(k=0;k<2;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{

System.out.print("\t"+(a[k][i][j]+b[k][i][j]));	
	
}	
System.out.println();	
}
System.out.println();
}
}

}