import java.io.*;
import java.util.*;
public class pattern32
{
public static void main(String args[])
{
int i,j,n,l;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{System.out.print(" ");}
for(l=0;l<n;l++)
{System.out.print("*");}
System.out.print("\n");
}
}}