import java.io.*;
import java.util.*;
public class pg7
{
public static void main(String args[])
{
int n,c;
int a=0,b=1;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
int count=0;
System.out.print("\n");
if(n==1)
{
System.out.print(a+","+b);
}
else if(n>1)
{
System.out.print(a+","+b);
while(count<n-2)
{
c=a+b;
a=b;
b=c;
count++;
System.out.print(","+c);
}
}
}
}