import java.math.BigInteger;
import java.util.Scanner;

public class takingInput {
    static void main(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value:");
        int val = sc.nextInt();

        System.out.print("Enter second Number :");
        int val2=sc.nextInt();

        System.out.println("Sum :" +(val +val2));

        System.out.print("Enter BigInteger :");
        BigInteger Bg = sc.nextBigInteger();

        System.out.println("BigInteger :"+ Bg);

        sc.close();
    }
}
