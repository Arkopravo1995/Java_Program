package DsaLevel1;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int r , sum=0;
        while (n>0){
            r = n %10;
            n = n/10;
            sum = sum + r*r*r;

        }
        if(temp == sum){
            System.out.println("yes");
        }
       else{
            System.out.println("no");
        }

    }
}
