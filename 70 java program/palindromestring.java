import java.util.*;
public class palindromestring {
public static void main(String[] args) {
    Scanner k=new Scanner (System.in);
    String a=k.nextLine();
    StringBuilder rb=new StringBuilder(a);
    rb.reverse();
    if(a.equals(rb.toString())){
    System.out.println(rb+" is a palindrome");}
    else{
    System.out.println(rb+" is not a palindrome");}
    k.close();
}
}
