import java.io.*;
import java.util.*;
public class pattern28
{
public static void main(String args[])
{
int i,j,n;
int a[]=new int[20];
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();

System.out.print("\n");
int l=0;
int len=0;
while(n>0)
{
a[l]= n % 10;
n=n/10;
l++;
len++;
}
for(i=0;i<len;i++)
{
for(j=len;j>i;j--)
{
int p=j-1;
System.out.print(a[p-i]);
p--;
}
System.out.print("\n");
}
}
}
