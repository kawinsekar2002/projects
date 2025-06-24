import java.io.*;
import java.util.*;
public class pg10
{
public static void main(String args[])
{
int n,i,j,l;
int count=1;
int a[]=new int[30];
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
a[i]=k.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]==-9)
{continue;}
for(l=j+1;l<n;l++)
{if(a[j]==a[l])
{count++;
a[l]=-9;
}}
System.out.println(a[j]+"-"+count);
count=1;
}
}}