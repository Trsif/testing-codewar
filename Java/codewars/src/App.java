import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size;
        int sum=0;
        System.out.println("size of array");
        size = sc.nextInt();
        int[] a = new int [size];
        System.out.println("enter array items");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int num : a ){
            sum += (num*num); 
        }
        System.out.println(sum);
    }
}

