import java.util.Scanner;

public class JavaBasicHWL2 {
    public static void main(String[] args) {

        System.out.println("Put in triple digit number:");
        Scanner input = new Scanner(System.in);
        int tripledigitnumber = input.nextInt();
        int firstNumber = tripledigitnumber / 100;

        System.out.println("First number is:");
        System.out.println(firstNumber);

        System.out.println("Second number is:");
        int secondNumber = tripledigitnumber / 10 % 10;
        System.out.println(secondNumber);

        System.out.println("Third number is:");
        System.out.println(tripledigitnumber % 10);
    }
}
