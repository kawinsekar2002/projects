import java.io.*;
import java.util.*;
public class pg18
{
public static void main(String args[])
{
int a,b,lcm;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number 1:");
a=k.nextInt();
System.out.print("Enter a number 2:");
b=k.nextInt();
while(a!=b)
{
if(a==0)
{
System.out.print("The HCF of the numbers is:"+b);
break;
}
if(b==0)
{
System.out.print("The HCF of the numbers is:"+a);
break;
}
if(a>b)
{
a-=b;}
if(b>a)
{
b-=a;}
}
if(a==b)
{
System.out.print("The HCF of the numbers is:"+a);
}}}