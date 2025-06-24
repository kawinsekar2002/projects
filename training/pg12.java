import java.io.*;
import java.util.*;
public class pg12
{
public static void main(String args[])
{
int i,j,n;
int a[]=new int[30];
int min=a[0];
int max=a[0];
Scanner o=new Scanner(System.in);
System.out.print("Enetr a numver:");
n=o.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
a[i]=o.nextInt();
if(a[i]>max)
{
max=a[i];
}}
for(j=0;j<n;j++)
{
if(min>a[j])
{
min=a[j];
}
}
System.out.println("Max of the array  is:"+max);
System.out.println("Min of the array is:"+ min);
}
}