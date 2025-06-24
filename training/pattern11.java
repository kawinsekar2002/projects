import java.io.*;
import java.util.*;
public class pattern11
{
public static void main(String arhgs[])
{
int i,j,s,l,n;
Scanner p=new Scanner(System.in);
System.out.print("Enter a number:");
n=p.nextInt();
System.out.print("\n");
for(i=-n;i<=n;i++)
{
if(i<0)
l=-i;
else
l=i;
for(s=0;s<l;s++)
{
System.out.print("  ");
}
for(j=0;j<2*(n-l)-1;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}
