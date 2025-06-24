import java.io.*;
import java.util.*;
public class pg16
{
public static void main(String args[])
{
int i,n;
String s;
char t[]=new char[10];
int r[]=new int[10];
Scanner k=new Scanner(System.in);
System.out.print("Enter a string:");
s=k.nextLine();
int g=0;
int d=0;
for(i=0;i<s.length();i++)
{
if(i%2==0)
{
s.charAt(i)=t[g];
g++;
}
else if(i%2!=0)
{
s.charAt(i)=r[d];
d++;
}
System.out.print(t[i]);
System.out.print(r[i]);
}



}
}