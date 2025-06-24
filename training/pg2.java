import java.io.*;
import java.util.*;
public class pg2
{
public static void main(String args[])
{
int i,j,k;
int a[]=new int[20];
Scanner o=new Scanner(System.in);
System.out.println("Enter a number:");
k=o.nextInt();
for(i=0;i<k;i++)
{
a[i]=o.nextInt();
}
int max=a[0];
int min=a[0];
for(j=1;j<k;j++)
{
if(a[j]>max)

max=a[j];
else if(a[j]<min)
min=a[j];
}
int range= max-min;
System.out.println(" The range of the array is:"+range);
}
}
