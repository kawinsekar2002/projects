import java.io.*;
import java.util.*;
public class pattern34
{
public static void main(String args[])
{
int n,i,j;
int b=1;
int c=1;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
for(i=1;i<=n;i++)
{
if(i%2!=0){
for(j=1;j<=n;j++)
{
if(j!=n){
System.out.print(b+"*");
}
else if(j==n)
{
System.out.print(b);
}
b++;
}}
else {
for(j=1;j<=n;j++)
{int a=(n*c)+j;
if(j!=n){
System.out.print(a+"*");
}
else if(j==n)
{
System.out.print(a);
}}
c++;}
System.out.print("\n");
}
}}
