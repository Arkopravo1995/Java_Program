package DsaLevel1;
import java.util.Scanner;
public class ProductSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int c = inp.nextInt();
        if(c== 1){
            int sum =0;
            for(int i = 1 ; i<=n ;i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }
        else if(c==2){
            int mul = 1;
            for(int i = 1 ; i<=n;i++){
                mul = mul*i;
            }
            System.out.println(mul);
        }
        else{
            System.out.println(-1);
        }

    }
}
