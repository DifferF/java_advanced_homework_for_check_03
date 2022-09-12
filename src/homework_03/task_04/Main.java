package homework_03.task_04;

/*
Задание 4+
Создайте в package текстовый файл и клас, внесите в файл некий текст.
Выведите на экран содержимое файла.
 */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Создали объект файла по ссылке
        File f1 = new File("task_04.txt");

        //true - будем дозаписывать в файл, false - будем перезаписывать файл
        PrintWriter pw = new PrintWriter(new FileWriter(f1, false));
        pw.println("Создайте в package текстовый файл и клас, внесите в файл некий текст.");
        pw.flush();
        pw.close();

        // Считываем текстовый файл в пакете
        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
    }
}
