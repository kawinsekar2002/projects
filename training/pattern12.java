import java.io.*;
import java.util.*;
public class pattern12
{
public static void main(String args[])
{
int i,j,n,s,l,v;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
for(i=-n;i<=n;i++)
{
if(i<0)
l=-i;
else
l=i;
for(j=0;j<=l;j++)
{
System.out.print("  ");
}
if(i>0)
{v=-i;
}
else
{
v=i;
}
for(s=0;s<=n+v;s++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}
