package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String b = "Носов Алексей Олегович";

        String[] a = b.split(" ");

        String c = a[0];
        String g = a[1];
        String h = a[2];

        char q = c.charAt(0);
        char w = g.charAt(0);
        char e = h.charAt(0);

        String u = (q + "." + w + "." + e + ".");


        System.out.println(u);

    }
}
