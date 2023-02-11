package Lecture54.Task3;

//Через аргумент командной строки передается строка.
//Используя StringBuilder, напишите программу,
//которая в переданной строке заменяет все нули на единицы и наоборот.
//Остальные символы не должны изменится.
//Выведите результирующую строку.
//
//Пример аргумента: 01a10vt0101c
//Вывод: 10a01vt1010c
//Проверку на наличие и корректность аргумента делать не надо.
public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(String.copyValueOf(args[0].toCharArray()));

        StringBuilder zero = new StringBuilder("0");
        StringBuilder one = new StringBuilder("1");

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == zero.charAt(0)) {
                text.replace(i, i + 1, "1");
            } else if (text.charAt(i) == one.charAt(0)) {
                text.replace(i, i + 1, "0");
            }
        }
        System.out.println(text);

    }
}
