import java.io.*;
import java.util.*;
public class pattern29
{
public static void main(String args[])
{
int i,j,k,n,l;
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();
for(i=0;i<n;i++)
{
int p=1;
for(j=n;j>i;j--)
{
System.out.print(p+" ");
p++;
}
for(k=0;k<2*i;k++)
{
System.out.print("* ");
}
int u=n-i;
for(l=n;l>i;l--)
{
System.out.print(u+" ");
u--;
}
System.out.print("\n");
}}}