import java.io.*;
import java.util.*;
public class pattern10
{
public static void main(String args[])
{
int i,j,n,s,l,v;
Scanner o=new Scanner(System.in);
System.out.print("Enter a number:");
n=o.nextInt();
for(i=-n;i<=n;i++)
{
if(i<0)
{
l=-i;
}
else
l=i;
for(s=0;s<=l;s++)
{
System.out.print(" ");
}
if(i>0)
{
v=-i;
}
else
{
v=i;
}
for(j=1;j<=n+v;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}}}