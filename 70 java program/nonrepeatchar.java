import java.util.*;
public class nonrepeatchar {
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        String a=k.nextLine();
        Character p = null;
        Map<Character, Integer> b=new LinkedHashMap<>();
        for(char c:a.toCharArray())
        {if (c != ' ') 
            b.put(c,b.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry :b.entrySet()){
 if(entry.getValue()==1){
p=entry.getKey();
break;
 }
        }
        if(p==null){
       System.out.println("There is no non repeating char in "+a);
        }
    else {
        System.out.println(p+" is the non repeating char in "+ '"'+a+'"');
    }k.close();}}