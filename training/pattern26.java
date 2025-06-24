import java.io.*;
import java.util.*;
public class pattern26
{
public static void main(String args[])
{
int i,j,k,n;
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();
for(i=1;i<=n;i++)
{
int p=i;
for(j=n;j>=i;j--)
{
System.out.print(p+" ");
p++;}
for(k=1;k<i;k++)
{
System.out.print(k+" ");
}
System.out.print("\n");
}
}}