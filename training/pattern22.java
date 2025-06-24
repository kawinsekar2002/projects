import java.io.*;
import java.util.*;
public class pattern22
{
public static void main(String args[])
{
int i,j,n;
Scanner k=new Scanner(System.in);
System.out.print("Enetr a number:");
n=k.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if( i%2 !=0 || j%2 ==0)
System.out.print(j+1+" ");
else 
System.out.print("* ");
}
System.out.print("\n");
}
}}