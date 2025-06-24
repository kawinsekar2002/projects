import java.util.*;
public class Duplicateremoval {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String p=k.nextLine();
        LinkedHashSet<Character> a= new LinkedHashSet<>();
        for(char b:p.toCharArray()){
            a.add(b);
        }
        for(char b:a){
            System.out.print(b);
        }
    k.close();
    }
}
