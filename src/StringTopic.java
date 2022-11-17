//Есть строка "Password123456qwerty"
//эта строка - пароль от Нетфликса одного известного человека
//Вы знаете, что этот пароль не безопасен. Вы хотите его изменить. Вот по какому правилу:
//1) заменить "qwerty" на "67tred$32"
//2) В начало строки добавить знак "*"
//3) цифру 3 заменить на three
//4) Повторить пароль два раза
//5) Создать из пароля подстроку с 5 символа по последний
//--------------
//6) Добавить в конец пароля длину самого этого пароля. Password -> 8 -> Password8
//7) Вставить в середину строки слово "Hello"

public class StringTopic {


    public static void main(String[] args) {


        String str = "Password1234qwerty";
        System.out.println(str);

        System.out.println(str.replace("qwerty", "67tred$32"));
        str = str.replace("qwerty", "67tred$32");

        str = "*" + str;
       System.out.println(str);

        str = str.replace("3", "three");
        System.out.println(str);

        System.out.println(str.repeat(2));
        str = str.repeat(2);

        str = str.substring(5);


        int passwordLength = str.length();
        System.out.println(str.length());

        str = str + passwordLength;
        System.out.println(str);


        //System.out.println(str.replace("3", "three"));



        //System.out.println(str.length()); //Длина строки
        //System.out.println(str.toLowerCase()); //к нижнему регистру
        //System.out.println(str.toUpperCase()); //к верхнему регистру
        //System.out.println(str.charAt(0)); //получить символ из строки.
        //// !!!Внимание!!! - первый символ имеет индекс = 0
//
        //int len = str.length();
        //System.out.println(str.charAt(len - 1)); //последний символ строки
//
        //System.out.println(str.charAt(str.length() - 1)); //можно и так найти последний символ
//
        //System.out.println(str.replace('a', 'b')); //замена всех символов на другой символы
        //System.out.println(str.replace("Java", "Python")); //замена подстроки на подстроку
//
        //System.out.println(str);
//
        //String strSecond = str.replace("good", "bad");
        //System.out.println(strSecond);
        //System.out.println(str.startsWith("Java"));
        //System.out.println(str.endsWith("good"));
        //System.out.println(str.indexOf('J'));
        //System.out.println(str.repeat(5));
        //str = "!";
        //str = str


    }
}
