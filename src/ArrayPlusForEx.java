import java.util.Arrays;
import java.util.Scanner;

public class ArrayPlusForEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = scanner.nextDouble();

        double[] speedArray = new double[101];
        speedArray[0] = speed;

        for (int i = 1; i < speedArray.length; i++) {
            speedArray[i]= speedArray[i - 1] * 0.97;
        }
        System.out.println(Arrays.toString(speedArray));
    }
}
