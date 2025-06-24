import java.io.*;
import java.util.*;
public class pg11
{
public static void main(String args[])
{
int i,j,k,n;
int a[]=new int[30];
Scanner o=new Scanner(System.in);
System.out.print("Enetr a numver:");
n=o.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
a[i]=o.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]==-1)
{
continue;
}
for(k=j+1;k<n;k++)
{
if(a[j]==a[k]){
a[k]=-1;
}
}
System.out.print(a[j]+" "+"");
}
}}