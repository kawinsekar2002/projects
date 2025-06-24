import java.io.*;
import java.util.*;
public class pg17
{
public static int[] sort(int a[],int n)
{
for(int i=1;i<=n;i++)
{for(int j=1;j<=n-1;j++)
{if(a[j]>a[j+1])
{int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}}}
return a;
}
public static void median(int a[],int n)
{
int b[]=sort(a,n);

if(n%2==0)
{
int r=n/2;
System.out.print("Mean of the array is:"+(((float)(b[r]+b[r+1]))/2));
}
else if(n%2==1)
{
int r=n/2+1;
System.out.print("Mean of the array is:"+b[r]);
}
}
public static void main(String args[])
{
int i,n;
int a[]=new int[20];
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
for(i=1;i<=n;i++)
{
a[i]=k.nextInt();
}
median(a,n);
}
}
