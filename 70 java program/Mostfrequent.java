import java.util.*;
public class Mostfrequent {
   public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    String a=k.nextLine();
    int n=0;
    Map<Character , Integer> b=new LinkedHashMap<>();
    for(char c:a.toCharArray()){
        if (c != ' ')
        b.put(c,b.getOrDefault(c,0)+1);
    }
    for(Map.Entry<Character,Integer> entry : b.entrySet()){
     if(entry.getValue()>n){
        n=entry.getValue();
     }
    }
    for(Map.Entry<Character,Integer> y : b.entrySet()){
    if(y.getValue()==n)
    System.out.println(y.getKey() + " = " + y.getValue());}
    k.close();
   }
}
