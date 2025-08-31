package homeworks.java.cosmo.string;

/**
 * Дан массив со строками: {“Дом”, “Стена”, “Машина”, “Телефон”, “Кот”, “Микроволновка”, “Деньги”, “Яхта”}.
 * Необходимо найти в данном массиве самую длинную строку и вывести ее на экран.
 * {...} > Микроволновка
 * <p>
 * Подсказка: используйте метод .length() класса String
 */
public class ExJ {
    public static void main(String[] args) {
        String[] input = {"Дом", "Стена", "Машина", "Телеffffdfffфон", "Кот", "Микроволновка", "Деньги", "Яхта" };

            int maxLength = 0;
            String result = new String();
            String maxLengthRes1 = new String();

            for ( int i = 0; i < input.length; i ++) {
                if (maxLength < input[i].length()) {
                    maxLength = input[i].length();
                    String maxLengthRes = input[i];
                    maxLengthRes1 = maxLengthRes;

                }



        }
        System.out.println(maxLengthRes1);
    }
}