import java.io.*;
import java.util.*;
public class pattern31
{
public static void main(String args[])
{
int i,j,n,k,l;
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();
for(i=1;i<=n;i++)
{
for(k=n-1;k>=i;k--)
{
System.out.print("  ");
}
int a=i;
for(j=0;j<i;j++)
{
System.out.print(" "+a);
a++;
}
int b=i+j-2;
for(l=0;l<i-1;l++)
{
System.out.print(" "+b);
b--;
}
System.out.print("\n");
}
}}