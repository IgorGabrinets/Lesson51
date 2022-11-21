import java.util.Scanner;
/// С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
// если число не равно 0, тогда выведите три сообщения "ERROR"

public class HomeWork_2111_level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String err = "ERROR   ";
        if (number == 0) {
            System.out.println("No spikes detected");
        } else System.out.println(err.repeat(3));
    }
}
