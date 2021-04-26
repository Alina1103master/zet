
public class Main {
    public static void main(String[] args) {
        int payment = 100;
        int bonus;
        if (payment <= 1000) {
            bonus=0;
        } else {
            bonus = payment / 100;
        }
        System.out.println( "итоговый бонус равен " + bonus );

    }
}