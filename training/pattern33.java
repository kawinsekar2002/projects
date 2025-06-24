import java.io.*;
import java.util.*;
public class pattern33
{
public static void main(String args[])
{
int n,i,a,j=1;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
int b=n;
int c=n-1;
for(i=1;i<=n;i++)
{

for(j=1;j<=n;j++)
{
a=(b*c)+j;
if(j!=n){
System.out.print(a+"*");
}
else if(j==n)
{
System.out.print(a);
}
a--;
}
c--;
System.out.print("\n");
}
}}
