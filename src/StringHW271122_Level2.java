//Level2:
//        Вводится строка, выведите первый ее символ на экран количество раз, равное длине всей строки. Например, строка "привет", значит результат будет такой:
//        п
//        п
//        п
//        п
//        п
//        п
//
//
//        Если строка "Как дела?", то в ней 9 символов, значит ответ будет:
//        К
//        К
//        К
//        К
//        К
//        К
//        К
//        К
//        К


import java.util.Arrays;
import java.util.Scanner;

public class StringHW271122_Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        //System.out.println(len);
        String second = String.valueOf(str.charAt(0));
        System.out.println(second.repeat(len));

    }
}
