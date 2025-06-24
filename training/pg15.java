
import java.util.Scanner;

public class pg15{
public static void main(String[] args) {
Scanner k = new Scanner(System.in);
System.out.print("Enter the String1: ");
String s1 = k.nextLine();
System.out.print("Enter the String2: ");
String s2 = k.nextLine();
int n=s1.length();
int n2=s2.length();
for(int i= 0; i<n;i++){
for(int j=0; j< n2; j++){
int compareOneTwo = Character.compare(s1.charAt(i),s2.charAt(j));
if(compareOneTwo==0){
char v ='-';
s2=s2.replace(s2.charAt(j),v);
compareOneTwo--;
}
}}
String s3=s1+s2.replaceAll("-","");
System.out.print("Concatinated string :"+s3);
}}

 