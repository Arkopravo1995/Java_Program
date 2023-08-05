package DsaLevel1;
import  java.util.*;
public class ScecondLargestElem {


    static  int findSecondLarge(int arr[] , int n){
        n = arr.length;
        int largest = arr[0];
        for(int i = 0 ; i < n ;i++){
            if(arr[i]> largest ){
                largest = arr[i];
            }
        }
        int secondLarge = -1;
        for (int i = 0 ; i<n;i++){
            if(arr[i] >secondLarge && arr[i] !=largest){
                secondLarge=arr[i];
            }
        }
        return secondLarge;

    }
    static  int getSecondSmallest(int arr[] , int n){
        n = arr.length;
        int smlarge = arr[0];
        int ssmall = -1;
        for(int i = 0 ; i< n ;i++){
            if(arr[i] < smlarge){
                smlarge =ssmall;
                ssmall = arr[i];

            }
            else if(arr[i] !=smlarge && arr[i] >ssmall){
                 ssmall =arr[i];

            }
        }
        return ssmall;
    }
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int b = inp.nextInt();
       int arr[] = new int[b];
       for(int i = 0  ; i <b ;i++){
           System.out.println("enter the element in an array : " + i +"th");
           arr[i] = inp.nextInt();

       }
       for(int i = 0 ; i<b ;i++){
           System.out.println(arr[i]);
       }


       int result = findSecondLarge(arr,b);
        System.out.println("the second largest element in array is : " +  result);
        int c = getSecondSmallest(arr, b);
        System.out.println(c);
    }
}
