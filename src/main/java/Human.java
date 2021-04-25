/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 * Класс сущности Human
 */

public class Human {

    /** Поле ID */
    private String ID;

    /** Поле имени */
    private String name;

    /** Поле пола */
    private String gender;

    /** Поле даты рождения*/
    private String birtDate;

    /** Поле подразделения */
    private Division division;

    /** Поле зарплаты */
    private String salary;

    /**
     * toString-метод
     */
    public String toString() {
        return ("ID: " + ID + ", " + name + ", " + gender + ", " + birtDate  + ", " + division.toString() + ", Salary: " + salary);
    }

    /**
     * Упрощенный toString-метод
     */
    public String toStringWithoutDivisionID() {
        return ("ID: " + ID + ", " + name + ", " + gender + ", " + birtDate  + ", " + division.getName() + ", Salary: " + salary);
    }

    /**
     * Getter/Setter методы
     */
    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}