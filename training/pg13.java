
import java.util.Scanner;

public class pg13 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = k.nextLine();
 System.out.print("\n");
       int len=s.length();
int i=0;
while(i<len)
{
char n=s.charAt(i);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
System.out.print( n+ " ");
else if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
System.out.print( n+ " ");
i++;
}
        }
    }

 