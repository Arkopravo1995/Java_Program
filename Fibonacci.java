package DsaLevel1;
import  java.util.Scanner;
public class Fibonacci {
    static  int  fibo(int n){
        if(n <= 1){
            return n;
        } else if (n == 2) {
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2) ;
        }


    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int b = inp.nextInt();
        int result = fibo(b);
        System.out.println(result);
    }
}
