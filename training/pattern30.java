import java.io.*;
import java.util.*;
public class pattern21
{
public static void main(String args[])
{
int i,j,n;
Scanner k=new Scanner(System.in);
System.out.print("Enetr a number:");
n=k.nextInt();
for(i=1;i<=n;i++)
{
int a=1;
for(j=n;j>=i;j--)
{
if(i%2==0)
{System.out.print(j-i+1);
}
else if(i%2 != 0){
System.out.print(a);
}
a++;
}
System.out.print("\n");

}}}