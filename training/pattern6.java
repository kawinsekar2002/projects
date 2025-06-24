import java.io.*;
import java.util.*;
public class pattern6
{
public static void main(String args[])
{
int i,j,k,n;
Scanner l=new Scanner(System.in);
System.out.print("Enter a number:");
n=l.nextInt();
System.out.print("\n");
for(i=0;i<=n;i++)
{
for(j=n-1;j>=i;j--)
{
System.out.print("  ");
}
for(k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}