package homeworks.java.cosmo.string;

import java.util.Locale;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";

        String[] a = input.split(" ");

        String b = new String();

       for (int i = 2; i >= 0; i--) {
           b = b + " " +  a[i];
       }
       b = b.trim();

       b = b.replace("?", "");

       b += "?";

       b = b.toLowerCase(Locale.ROOT);

       b = b.replaceFirst("д", "Д");

        System.out.println(b);

    }
}