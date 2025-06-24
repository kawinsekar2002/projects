import java.io.*;
import java.util.*;
public class pg19
{
public static void main(String args[])
{
int a,b,lcm;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number 1:");
a=k.nextInt();
System.out.print("Enter a number 2:");
b=k.nextInt();
int max=a>b?a:b;
while(true)
{
if(max%a==0&&max%b==0)
{lcm=max;
break;
}
max++;
}
System.out.print("The LCM of the numbers is:"+lcm);
}}