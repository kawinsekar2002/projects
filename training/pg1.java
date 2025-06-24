import java.io.*;
import java.util.*;
public class pg1
{
public static void main(String args[])
{
int i,l,n=0;
int a[]=new int[10];
Scanner o=new Scanner(System.in);
System.out.println("Enter a number:");
l=o.nextInt();
for(i=0;i<l;i++)
{
a[i]=o.nextInt();
n=n+a[i];
}
int total=n/l;
double mean=total;
System.out.println("mean of the array is:"+mean);
}
}