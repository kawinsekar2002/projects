import java.util.*;
import java.io.*;
public class pg3
{
public static void main(String args[])
{
int a=0;
String n;
System.out.println("Enter a string:");
Scanner k=new Scanner(System.in);
n=k.nextLine();
int j=n.length()-1;
int i=0;
while(i<j)
{
if(n.charAt(i)!=n.charAt(j))
{
 a=1;
}
i++;
j--;
}
if(a==0)
{
System.out.println("This string is a palindrome");
}
else
System.out.println("This string is not a palindrome");
}
}