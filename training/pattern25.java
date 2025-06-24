import java.io.*;
import java.util.*;
public class pattern25
{
public static void main(String args[])
{
int i,j,k,n;
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();
for(i=1;i<n;i++)
{
for(k=n;k>i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.print("\n");
}
}}