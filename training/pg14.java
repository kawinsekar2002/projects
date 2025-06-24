
import java.util.Scanner;

public class pg14 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = k.nextLine();
 
       int len=s.length();
int i=0;
while(i<len)
{
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
System.out.print( s.toLowerCase().charAt(i));
else if(s.charAt(i)>='a' && s.charAt(i)<='z')
System.out.print( s.toUpperCase().charAt(i));
i++;
}
        }
    }

 