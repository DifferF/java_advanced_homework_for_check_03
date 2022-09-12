package homework_03.task_02;


import java.io.*;


/*
Задание 2+
Создайте файл, запишите в него произвольные данные и закройте файл.
Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
 */

public class Main {

    public static void main(String[] args) throws IOException {
            FileWriter writerSimple = new FileWriter("task_02.txt");
            writerSimple.write("Задание 2\n" +
                    "Создайте файл, запишите в него произвольные данные и закройте файл.\n" +
                    "Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.");
            writerSimple.close();

        // Создали объект файла по ссылке
        File f1 = new File("task_02.txt");

        // Считываем текстовый файл в пакете
        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
    }
}
