import java.io.*;
import java.util.*;
public class pg5
{
public static void main(String args[])
{
int i;
String s;
String rev="";
Scanner k=new Scanner(System.in);
System.out.println("Enter a string:");
s=k.nextLine();
int len=s.length()-1;
for(i=len;i>=0;i--)
{
rev =rev+s.charAt(i);
}
if(s.equals(rev))
System.out.println("The string a palindrome");
else
System.out.println("the string is not a palindrome"+rev+" "  + s );
}}
