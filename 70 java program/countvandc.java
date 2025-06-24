import java.util.*;
public class countvandc{
    public static void main(String args[]){
        Scanner k=new Scanner(System.in);
        int v = 0,c =0;
        String m=k.nextLine();
        for(int i =0; i<m.length();i++){
        if(m.charAt(i) == 'a' || m.charAt(i) == 'e' || m.charAt(i) =='i' ||m.charAt(i)== 'o' || m.charAt(i) =='u' ||  m.charAt(i) == 'A'|| m.charAt(i) == 'E'|| m.charAt(i) == 'I'|| m.charAt(i) == 'O' || m.charAt(i) == 'U' )
        {   v++;   }
        else {   c++;  }
    }
System.out.println("Number of Vowels in " + v);
System.out.println("Number of Consonants in " + c);
k.close();
}}