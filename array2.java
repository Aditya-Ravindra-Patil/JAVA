import java.util.*;
class array2
{
	
	
public static void main(String args[])
{
int a[]={2,1,1,5,4,8,1,2,2,2,1,3};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any element: ");
int b=sc.nextInt();
int count=0,c=0;
int d=0,max=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==b)
{
count++;
}
if(a[i]==b)
System.out.print(i+" ");
if(b==a[i])
	c=a[i];

}

System.out.println();
System.out.println(count);

if(b==c)
System.out.println("Element is present.");
else 
System.out.println("Element is not present. ");

for(int j=0;j<a.length;j++)
{
	if(max<a[j])
			max=a[j];
	
}
System.out.println("max element is"+max);

int z=0;
	
	
		for(int k=0;k<a.length;k++)
		{z=0;
			for(int l=0;l<a.length;l++)
			{
				if(a[k]==a[l])
					z++;
				
			}
			int m=z;
			
		}
		if(m>c)
		{
			System.out.println(a[k]);
		}		
}
}