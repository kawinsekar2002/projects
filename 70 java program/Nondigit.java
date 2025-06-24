import java.util.*;
public class Nondigit {
   public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    String a=k.nextLine();
    boolean v=false;
    for(char c:a.toCharArray()){
        if(c >= '0' && c <= '9'){
            v=true;
        }
        else{
           v= false;
           break;
        }
    }
    if(v==true){
        System.out.println("This is a  digit string");
    }
    else 
    {
        System.out.println("This is NOT a digit string");
    }
    k.close();
   }
}
