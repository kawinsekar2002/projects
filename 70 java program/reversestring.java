import java.util.*;
public class reversestring
{
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        String a = k.nextLine();
        int l= a.length();
        char[] r = new char[l];
        for (int i=0;i<l;i++){
           r[i] = a.charAt(l-1-i); 
        }
        String reversed = new String(r);
        System.out.println(reversed);
        k.close();
    }
}