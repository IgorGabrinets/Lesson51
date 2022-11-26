//Level2:
//В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A. Например ABBA -> BAAB

import java.util.Scanner;

public class StringHW_261122_Level2 {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace('A', '*');
        str = str.replace('B', 'A');
        str = str.replace('*', 'B');
        System.out.println(str);
    }
}



