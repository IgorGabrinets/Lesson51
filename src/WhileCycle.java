import java.util.Scanner;

public class WhileCycle {
    public static void main(String[] args) {
        int daysToDie = 365 * 75;
        while (daysToDie !=0) {
            System.out.println("Проснулся. Потянулся " + daysToDie);
            daysToDie--;
            //System.out.println("The end!!!");
       }
    }
}
