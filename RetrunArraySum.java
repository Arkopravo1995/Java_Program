package DsaLevel1;
import java.util.Scanner;
public class RetrunArraySum {
    static  int arraySum(int arr[] , int n){
        n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ;i++){
           sum  = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6, 8};
        int n = arr.length;
        int result = arraySum(arr , n);
        System.out.println(result);
    }
}
