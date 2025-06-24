import java.io.*;
import java.util.*;
public class pattern1
{
public static void main(String args[])
{
int i,j,n;
Scanner l=new Scanner(System.in);
System.out.print("Enetr a number:");
n=l.nextInt();
for(i=0;i<=n;i++)
{
for(j=1;j<=n;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}}