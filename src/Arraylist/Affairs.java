package Arraylist;


// Класс нужен просто как сущность, у заметок есть только название (name)
// Добавил конструктор и toString
public class Affairs {

    private String name;

    public Affairs(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Affairs{" +
               "name='" + name + '\'' +
               '}';
    }

}



