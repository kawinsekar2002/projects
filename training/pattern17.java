import java.io.*;
import java.util.*;
public class pattern17
{
public static void main(String args[])
{
int i,j,s,v,l,n;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
for(i=-n;i<=n;i++)
{
if(i>0)
{
l=-i;
}
else
l=i;
for(s=0;s<=n+l;s++)
{
System.out.print("  ");
}
if(i<0)
{
v=-i;
}
else
v=i;
for(j=0;j<2*v+1;j++)
{
if(j==0 || j==2*v)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}

}
System.out.print("\n");
}
}}