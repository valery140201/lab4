/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 *  Класс преобразотель из .csv в List<>
 */

import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.util.List;

public class csvReader {

    /** Поле пути файла*/
    private static String csvFilePath = "C:/Users/bocsh/OneDrive/Desktop/foreign_names.csv";

    /**
     * @param humanList - список для заполнения
     * @return заполненный список, полученный из @param
     * Открывает файл с определенным путем
     * Считывает построчно
     * Делит строки и распределяет их
     * По соответствующим полям временного экземпляра класса Human
     * Добавляет экземпляр в список
     * @throws IOException если I/O операции завершились ошибкой или были прерваны
     */
    static List<Human> csvToList(List<Human> humanList) throws IOException {

        CSVReader reader = new CSVReader(new FileReader(csvFilePath), ';');
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                Human tmpHuman = new Human();
                tmpHuman.setID(nextLine[0]);
                tmpHuman.setName(nextLine[1]);
                tmpHuman.setGender(nextLine[2]);
                tmpHuman.setBirtDate(nextLine[3]);
                tmpHuman.setDivision(new Division(nextLine[4]));
                tmpHuman.setSalary(nextLine[5]);
                humanList.add(tmpHuman);
            }
        }
        return humanList;
    }
}