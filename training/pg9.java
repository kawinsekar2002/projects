import java.io.*;
import java.util.*;
public class pg9
{
public static void main(String ars[])
{
int i,n,j;
Scanner k=new Scanner(System.in);
System.out.print("Enter a number:");
n=k.nextInt();
System.out.print("\n");
System.out.print(0+" "+1+" ");
for(i=2;i<=n;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0 ||n<=1)
break;
}
if(i==j)
System.out.print(i+" ");
}
}

}

