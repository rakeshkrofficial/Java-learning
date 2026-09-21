import java.util.Scanner;

public class onditions {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a marks :");
        int marks = sc.nextInt();

        if (marks >=90){
            System.out.println("Outstanding !");

        }
        else if(marks>=80){
            System.out.print("Exicellent !");
        }
        else if(marks>=70){
           System.out.print("Best !");
        }
        else if(marks>=60){
            System.out.print("Good !");
        }
        else {
            System.out.println("Need Improvement !");
        }
    }
}
