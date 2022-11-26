//Level1:
//Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз, равное введенному числу

import java.util.Scanner;

public class StringHW271122_Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = "Я начинаю разбираться с циклами | ";
        System.out.println(str.repeat(number));
    }
}
