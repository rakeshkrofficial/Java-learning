public class Unary_Inc_Dec_OP {
    static void main(){
        int activeUsers=100;

        int prefix=++activeUsers;
        int postfix=activeUsers ++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);

        int a=10;

        int b=--a;
        System.out.println(b);

        int A=10;
        int c=A--;
        System.out.println(c);

    }
}
