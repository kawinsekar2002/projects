import java.io.*;
import java.util.*;
public class pattern19
{
public static void main(String args[])
{
int i,j,s,n;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
for(s=n-1;s>i;s--)
{
System.out.print("  ");
}
for(j=0;j<2*i+1;j++)
{
if(j==0 || j==2*i || i==n-1)
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