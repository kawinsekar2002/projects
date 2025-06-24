import java.io.*;
import java.util.*;
public class pattern24
{
public static void main(String args[])
{
int i,j,n;
Scanner k=new Scanner(System.in);
System.out.print("Enetr a number:");
n=k.nextInt();
for(i=0;i<n;i++)
{
int p=0;
for(j=n;j>i;j--)
{
p++;
System.out.print(p+" ");
}
System.out.print("\n");
}
}}