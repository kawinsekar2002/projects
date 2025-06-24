import java.io.*;
public class pattern4
{
public static void main(String argd[])
{
int i,j,k,n=5;
for(i=0;i<=n;i++)
{
for(j=0;j<i;j++)
{
System.out.print(" ");
}
for(k=n;k>i;k--)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}