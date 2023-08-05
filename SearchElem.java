package DsaLevel1;
import java.util.Scanner;
public class SearchElem {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = {7,8,20,18,6,10};
        int n = arr.length;
        int idx =-1;
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == key){
                 idx = i;
                break;
            }

        }
        System.out.println(idx);

    }

}
