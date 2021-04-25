/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 *  Основной класс
 */

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Human> humanList = new LinkedList<>();
        csvReader.csvToList(humanList);
        for (Human i : humanList) {
            System.out.println(i.toString());
        }
    }
}
