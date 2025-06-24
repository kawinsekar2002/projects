import java.util.*;
public class Spaceremoval {
public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    String a=k.nextLine();
    String b=a.replaceAll(" ","");
System.out.println(b);k.close();
    }
}

