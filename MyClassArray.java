import java.util.Scanner;

public class MyClassArray {

    //print array 
    public static void printArray(int array[]){
        System.out.println("the array is: ");
        for(int i =  0 ;  i < array.length ; i++){
            System.out.print( array[i]);
        }

    }

    //data insertaion in array
    public static void insert(int arr[] , int element, int pos){
        int n = arr.length;

        if(pos < 0 || pos > n-1){
            System.out.println("wrong position");
        }
        //shifting towards  at the end
            for(int i = n-2 ; i >pos ; i--){
                arr[i+1] = arr[i];
            }

            arr[pos] = element;
        

    }
    //shifting towards index
    public static void delete(int arr[] , int pos){
        for(int i =  0 ; i < arr.length-2 ;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    public static void main(String[] args) {
        
        int rollNo[] =new  int[5];
        // int age[] ={} ;
        rollNo[0] = 5;
        // System.out.println(rollNo);
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ;  i < rollNo.length ;i++){
            System.out.println("enter the element in this array : " + i + " th element :" );
            int element = sc.nextInt();
            rollNo[i] = element;
            // System.out.print(rollNo[i] + " ");
        }
        printArray(rollNo);

        insert(rollNo, 7, 3);

        printArray(rollNo);

        delete(rollNo, 2);
        printArray(rollNo);
    }
    
}
