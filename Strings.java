            /* Строки */

public class Strings {
    public static void main(String[] args){
    // **** Первое задание ****
        String word = "Amazing";
        String firstNumbers = word.substring(0, 3);
        String lastNumbers = word.substring(word.length() - 3);
        System.out.println(firstNumbers);
        System.out.println(lastNumbers);

    // **** Второе задание ****
        String word_2 = "Proto";
        int n = word_2.length();
        int x = n/2;
        System.out.println(word_2.charAt(x));

    // **** Третье задание ****
        String word_3 = "бот";
        String word_4 = "Разработчик";
        System.out.println(word_4.contains(word_3));

    // **** Четвертое задание ****
        String word_5 = "Java";
        int value = word_5.indexOf('v');
        System.out.println(value);

    }
}
