package homework_03.task_03;

/*
Задание 3+
Необходимо создать строку с текстом (текст взять любой из интернета).
Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
 */

public class TestSubstring {
    public static void main(String[] args) {
        String forTestText = "Необходимо создать строку с текстом (текст взять любой из интернета).";
        String forTestSubstring_1 = forTestText.substring(0,forTestText.length()/2);
        String forTestSubstring_2 = forTestText.substring(forTestText.length()/2);
        System.out.println(forTestSubstring_1);
        System.out.println(forTestSubstring_2);
    }
}
