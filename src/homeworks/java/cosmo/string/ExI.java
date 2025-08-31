package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };

        String a = input[0];
        String b = input[1];
        String c = input[2];

        String d = String.format("+7-%s-%s-%s-%s", a.substring(0, 3), a.substring(3, 6),  a.substring(6, 8), a.substring(8, 10));

        System.out.println(d);




    }
}