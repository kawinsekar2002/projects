import java.io.*;
import java.util.*;
public class pattern23
{
public static void main(String args[])
{
int i,j,n;
int o=1;
Scanner k=new Scanner(System.in);
System.out.print("Enetr a number:");
n=k.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(o+" ");
o++;
}
System.out.print("\n");
}
}}