import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Бабуль, просто напиши, сколько лет ты работала:");
        int workTime = s.nextInt();
        int pension = workTime * 100;
        System.out.println("Бабуль, вот сколько денег ты получишь: " + pension + " Евро");


    }
}
