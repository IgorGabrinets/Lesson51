import java.util.Scanner;

public class AsterixAndObelix {
    public static void main(String[] args) {
        System.out.println("Level 1");

        double minimalCookingTime = 5;
        double asterixCookingTime = 3;
        System.out.println("Asterix cooking time: " + asterixCookingTime + " hours");

        double obelixCookingTime = asterixCookingTime / 2;
        System.out.println("Obelix cooking time: " + obelixCookingTime + " hours");

        double cookingTimeTogether = obelixCookingTime + asterixCookingTime;
        System.out.println("Cooking time together: " + cookingTimeTogether + " hours");

        boolean ready = cookingTimeTogether > minimalCookingTime; // true
        System.out.println("Is the potion ready?: " + ready + " (ready if the answer is true, not ready if the answer is false)");

        System.out.println("Level 2"); //Enter a number
        System.out.println("Enter a number:");

        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int a = 2;
        int x = n % a;
        boolean evenNumber = x <= 0; //false
        System.out.println(evenNumber);

    }
}
