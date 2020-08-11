import java.util.Scanner;
public class Array {
    public static void mean(int [] arr){
        int total = 0;
        for (int i=0 ; i < arr.length ; i++){
            total += arr[i];
        }
        System.out.println("Ortalama :" + (double)total/arr.length);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int arr1[] = new int[5];

        System.out.println("Array1'in değerlerini girin...");
        for (int i = 0 ; i < arr1.length ; i++){
            arr1[i] = scan.nextInt();
        }

        mean(arr1);
    }
}