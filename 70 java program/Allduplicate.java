import java.util.*;
public class Allduplicate {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String a=k.nextLine();
        Map<Character ,Integer> l=new LinkedHashMap<>();
        for(char c:a.toCharArray()){
            if (c != ' ') 
            l.put(c,l.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character ,Integer> f:l.entrySet()){
            if(f.getValue()>1){
                System.out.print(" "+f.getKey());
            }
        }
        
k.close();
    }
}
