import java.io.*;
public class pattern3
{
public static void main(String arg[])
{
int i,j,k,n=5;
for(i=1;i<=n;i++)
{
for(j=1;j<i;j++)
{
System.out.print("  ");
}
for(k=n;k>=i;k--)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}
