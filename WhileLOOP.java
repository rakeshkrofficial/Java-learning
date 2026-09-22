public class WhileLOOP {
    static void main(){


        int i=1; // init

        while(i<=10){ // Condition
            int j=1; // init

            System.out.println("i= "+i);

            while(j<=10){ // condition
                System.out.print("  j = "+j);

                j++; // Update
            }
            System.out.println();
            i++; // Update
        }
    }
}
