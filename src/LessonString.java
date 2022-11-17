import java.util.Locale;

public class LessonString {


    public static void main(String[] args) {

        String a = "Hey";
        String b = "Hello";
        System.out.println(a + b);


        String str = "Java is good";



        System.out.println(str.length()); //Длина строки
        System.out.println(str.toLowerCase()); //к нижнему регистру
        System.out.println(str.toUpperCase()); //к верхнему регистру
        System.out.println(str.charAt(0)); //получить символ из строки.
        // !!!Внимание!!! - первый символ имеет индекс = 0

        int len = str.length();
        System.out.println(str.charAt(len - 1)); //последний символ строки

        System.out.println(str.charAt(str.length() - 1)); //можно и так найти последний символ

        System.out.println(str.replace('a', 'b')); //замена всех символов на другой символы
        System.out.println(str.replace("Java", "Python")); //замена подстроки на подстроку

        System.out.println(str);

        String strSecond = str.replace("good", "bad");
        System.out.println(strSecond);
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("good"));
        System.out.println(str.indexOf('J'));
        System.out.println(str.repeat(5));
        str = "!";



    }
}
