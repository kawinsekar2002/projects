import java.io.*;
import java.util.*;
public class pattern21
{
public static void main(String args[])
{
int i,j,n;
Scanner k=new Scanner(System.in);
System.out.print("Enetr a number:");
n=k.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==n-1 || j==0 || j==n-1 )
{System.out.print("* ");
}
else
System.out.print("  ");
}
System.out.print("\n");
}
}}