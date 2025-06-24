import java.io.*;
import java.util.*;
public class pattern27
{
public static void main(String args[])
{
int i,j,n;
char a[]={'A','B','C','D','E','F','G','H','I','J'};
Scanner o=new Scanner(System.in);
System.out.print("Enetr a number:");
n=o.nextInt();
System.out.print("\n");
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[n-i-1]);
}
System.out.print("\n");
}
}
}