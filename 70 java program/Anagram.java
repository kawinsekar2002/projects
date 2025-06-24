import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String a=k.nextLine();
        String b=k.nextLine();
        if(anagram(a,b)){
            System.out.println(a + " "+b+ " is a anagram");
        }
        else{
            System.out.println(a +" "+b+ " is not a anagram");
        }
        k.close();
    }
    public static boolean anagram(String a,String b){
      a=a.replaceAll("\\s","").toLowerCase();
      b=b.replaceAll("\\s","").toLowerCase();
       if (a.length() != b.length()) return false;
       char a1[]=a.toCharArray();
       char[] b1=b.toCharArray();
       Arrays.sort(a1);
       Arrays.sort(b1);
       return Arrays.equals(a1, b1);

    }
}
