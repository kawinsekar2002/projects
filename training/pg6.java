import java.io.*;
import java.util.*;
public class pg6
{
public static int order(int n)
{
int a=0;
while(n!=0)
{
n=n/10;
a++;
}
return a;
}
public static void main(String args[])
{
int v,n,arm=0;
int rem=0;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
int b=n;
v=order(n);
System.out.print("\n");
while(n>0)
{
rem=n%10;
arm=arm+(int)(Math.pow(rem,v));
n=n/10;
}
if(arm==b)
{
System.out.println("The number is a armstrong");
}
else
{
System.out.println("The number is a not armstrong");
}
}
}
