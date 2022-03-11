import java.util.*;
class array2d1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];

int i,j;
System.out.println("Enter the 1st array element:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the 2nd array element");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print("\t"+c[i][j]);
}
System.out.println();
}

}
}