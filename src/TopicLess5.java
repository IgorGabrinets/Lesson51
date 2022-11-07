//Бил - акула с Уолл-стрит. Он быстро зарабатывает, но и быстро теряет деньги.
//За вчера Бил умножил свой капитал в 5 раз, за сегодняшнее утро он потерял 100_000_000 долларов
//а вечером снова удвоил свой капитал.
//Бил хочет, чтобы вы написали такую программу: он введет число (одно) - количество денег, которое было позавчера
//Вы должны узнать, сколько у него сейчас

import java.util.Scanner;

public class TopicLess5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму первоначальной инвестиции:");
        long initialInvestment = s.nextLong();

        System.out.println("Сумма денег на первом рабочем этапе:");
        System.out.println(initialInvestment * 5);

        System.out.println("Сумма денег на промежуточном этапе (с убытками):");
        long losses = 100_000_000;
        long atALoss = initialInvestment * 5 - losses;
        System.out.println(atALoss);

        System.out.println("Сумма денег на конечном этапе инвестиции:");
        long totalsAtTheEnd = atALoss * 2;
        System.out.println(totalsAtTheEnd);
    }
}
