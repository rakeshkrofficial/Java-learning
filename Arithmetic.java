static void main(){
    int solvedThisWeek=25;
    int solvedLastWeek=15;

    int total = solvedThisWeek+ solvedLastWeek;
    int difference= solvedThisWeek - solvedLastWeek;
    int projected = solvedThisWeek * 7;
    int Average = solvedLastWeek / 3;
    int Remainder = solvedThisWeek % 4;

    System.out.println(total);
    System.out.println(difference);
    System.out.println(projected);
    System.out.println(Average);
    System.out.println(Remainder);
}
