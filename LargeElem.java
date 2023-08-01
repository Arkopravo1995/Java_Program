package DsaLevel1;

public class LargeElem {
    static int findLargeElem(int arr[] ,int n){
        n = arr.length;
        int largest = arr[0];
        for(int i = 0 ; i<n ;i++){
            if(arr[i] > largest){
                largest =arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []arr = {5,8,10,4,19,40};
        int n = arr.length;
        int result = findLargeElem(arr,n);
        System.out.println("the largest element in array is: " + result);
    }
}
