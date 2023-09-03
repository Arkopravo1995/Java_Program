package DsaLevel1;

public class BinarySearch {
    public static int binarySearch(int arr[], int data) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < data) {
                lo = mid + 1;
            } else if (arr[mid] > data) {
                hi = mid - 1;

            } else {
                return mid;

            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {2, 39, 10, 30, 8, 9};
        int data = 10;
        int res = binarySearch(arr,data);
        System.out.println(res);

    }
}