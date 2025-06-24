import java.io.*;
import java.util.*;
public class pg7
{
static int factorial(int n)
{
if(n==0 || n==1 )
{
return 1;
}
else
return n*-factorial(n-1);
}
public static void main(String args[])
{
int n;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
int fact=factorial(n);
System.out.print("factorial of a number:"+fact);
}
}