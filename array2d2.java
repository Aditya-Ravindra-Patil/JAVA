import java.util.*;
class array2d2
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a[][]=new int[2][2];
 int b[][]=new int[2][2];
 int c[][]=new int[2][2];
 int i,j,k;

 System.out.println("Enter the 1st element:");
 for(i=0;i<2;i++)
 {
 for(j=0;j<2;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 
 System.out.println("Enter the 2st element:");
 for(i=0;i<2;i++)
 {
 for(j=0;j<2;j++)
 {
 b[i][j]=sc.nextInt();
 }
 }
 
 System.out.println("mul of mat is:");
 
 for(i=0;i<2;i++)
 {
 for(j=0;j<2;j++)
 {
	 c[i][j]=0;
	 for(k=0;k<2;k++)
 {
 c[i][j]=c[i][j]+a[i][k]*b[k][j];
 }
 System.out.print("\t"+c[i][j]);
 }
 System.out.println();
 }
 
}
}