//Level2
//Мартин играет в рулетку. Он крутит ее два раза. Если в первый раз выпадет 36 И во второй выпадет 17,
//то он выиграет джекпот. Если в первый раз выпадет 36 ИЛИ во второй раз выпадет 17, то он выиграет маленький приз.
//Если выпадет НЕ 36 И НЕ 17, то он все проиграет.
//С консоли считывается два числа, первое число - сколько выпало на рулетке первый раз,
//второе число - сколько выпало второй раз. Напишите, что выиграет Марин

import java.util.Scanner;

public class HomeWork2111_Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fist number and press ENTER");

        int first = scanner.nextInt();
        System.out.println("Input second number and press ENTER");

        int second = scanner.nextInt();
        if (first == 36 && second == 17) {
            System.out.println("JACKPOT!!!");
        } else if (first == 36 && second != 17)
            System.out.println("Small prize!!!");

        else if (first != 36 && second == 17)
            System.out.println("Small prize!!!");

        else if (first != 36 && second != 17)
            System.out.println("You lost everything \uD83D\uDE31");
    }
}

