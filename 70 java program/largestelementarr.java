import java.util.*;
public class largestelementarr{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length=k.nextInt();
     int[] a=new int[length];
     if (length<0){
        System.out.println("Invalid length of array");
     }
        for(int i=0;i<length;i++){
            a[i]=k.nextInt();
        }
        int lar=a[0];
        for(int i=0;i<length;i++){
            if(a[i]>lar){
                lar=a[i];
            }
        }
        System.out.println( lar + " is the largest element of the array.");
        k.close();
    }
}