//First level: Level1:
//1) В программу (в консоль) вводится строка. Найдите длину строки, если она больше 10, то выведите true, иначе false
//2) В программу (в консоль) вводится строка. Если первый и последний символ равны - выведите true, иначе false

import java.util.Scanner;

public class StringHW_261122_Level1 {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println(str);
        System.out.println("Number of characters per line: " + str.length());
        int len = str.length();
        if (len > 10) {
            System.out.println("True");
        } else System.out.println("False");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(len - 1));
        int first = str.charAt(0);
        int last = str.charAt(len - 1);
        if (first == last) {
            System.out.println("True");
        } else System.out.println("False");
    }
}

