import java.util.Scanner;

public class Lesson_14112022_1 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
        System.out.println(number % 10); //третья цифра числа
        System.out.println(number / 100);//первая цифра числа
        System.out.println(number / 10 % 10);
    }
}
