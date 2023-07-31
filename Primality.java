package DsaLevel1;
import java.util.Scanner;
public class Primality {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for(int i = 0 ; i<t;i++){
            int n= inp.nextInt();
            int count =0;
            for(int div =2 ; div*div <=n ;div++){
                if(n%div ==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("prime");
            }
            else {
                System.out.println("its not prime");
            }
        }

    }
}
