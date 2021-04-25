/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 * Класс сущности Division
 */

import java.util.UUID;

public class Division {

    /** Поле ID */
    private UUID ID;

    /** Поле названия */
    private String name;

    /**
     * Конструктор подразделения
     * @param name - название подразделения
     */
    public Division(String name) {
        this.ID = UUID.randomUUID();
        this.name = name;
    }

    /**
     * toString-метод
     */
    public String toString() {
        return ("(Division: " + name + ", " + ID + ")");
    }

    /**
     * Getter/Setter методы
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}