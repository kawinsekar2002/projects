import java.io.*;
import java.util.*;
public class pattern14
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
for(s=0;s<=i;s++)
{
System.out.print("  ");
}
for(j=0;j<2*(n-i)-1;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}