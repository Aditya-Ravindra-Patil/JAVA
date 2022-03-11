import java.util.*;
class array3d
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int a[][][]=new int[2][2][3];
int i,j,k,z;

System.out.println("Enter the element: ");

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

for(k=0;k<1;k++)
{
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
a[k][i][j]=a[k][i][j]+a[k+1][i][j];
System.out.print("\t"+a[k][i][j]);	
	
}	
System.out.println();	
}
}
}

}