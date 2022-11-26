import java.util.Arrays;

public class Lesson2511 {
    public static void main(String[] args) {
        int[] array = new int[5];
        // DRY Don't repeat yourself
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        System.out.println(Arrays.toString(array));
    }
}
