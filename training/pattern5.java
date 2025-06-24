import java.io.*;
import java.util.*;
public class pattern5
{
public static void main (String args[])
{
int i,j,k,n;
Scanner l= new Scanner(System.in);
System.out.println("Enter a n number:");
n=l.nextInt();
for(i=1;i<=n;i++)
{
for(j=n-1;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}