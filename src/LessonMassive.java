import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonMassive {
    public static void main(String[] args) {
        //nt a= 5;
        //int[] hello = new int[20]; //3 ячейки с индексами 0-2
        //int[][] array = new int[2][3];
        //System.out.println(Arrays.deepToString(array));
        //System.out.println(a);
        //System.out.println(Arrays.toString(hello));
        //System.out.println(hello[19]);
        //hello [10] = 500;
        //hello [14] = -100500;
        //array[1]
        //[]
        //System.out.println(Arrays.toString(hello));
        //int[] array = new int[100];
        //// DRY Don't repeat yourself
        //for (int i = 0; i < array.length; i++) {
        //    array[i] = 7;
        //}
        //System.out.println(Arrays.toString(array));

        //-------
        //Scanner scanner = new Scanner(System.in);
        //int[] array = new int[100];
        //// DRY Don't repeat yourself
        //for (int i = 0; i < array.length; i++) {
        //    array[i] = scanner.nextInt();
        //}
        //System.out.println(Arrays.toString(array));
        //-------
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(random.nextInt(0,1000));

        int[] array = new int[5];
        // DRY Don't repeat yourself
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

}
