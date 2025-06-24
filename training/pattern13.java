import java.io.*;
import java.util.*;
public class pattern13
{
public static void main(String args[])
{
int i,s,n;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
for(s=0;s<i;s++)
{
System.out.print(" ");
}
System.out.print("*");
System.out.print("\n");
}
}}