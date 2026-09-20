import java.util.Scanner;
public class forLOOP {
    static void main(){
//        for(int i=1;i<=100;i++){
//            System.out.println(i +".\uD83D\uDE18");
//        }

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=2+i;j++){
                if(j<2-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
