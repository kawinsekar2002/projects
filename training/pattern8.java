import java.io.*;
import java.util.*;
public class patter8
{
public static void main(String args[])
{
int i,j,k,n;
Scanner o=new Scanner(System.in);
System.out.print("Enter a number:");
n=o.nextInt();
System.out.print("\n");
for(i=-n;i<=n;i++)
{
if(i<0)
{
k=-i;
}
else
{k=i;}
for(j=0;j<n+1;j++)
{
if(j<n-k)
System.out.print("  ");
else
System.out.print("* ");
}
System.out.print("\n");
}
}}