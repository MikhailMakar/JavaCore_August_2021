package lessons.lesson03092021.cloning;

import java.util.Date;

public class Department implements Cloneable {
    private String name;
    private Date date = new Date();

    public Department(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Department clone() throws CloneNotSupportedException {
        Department obj = null;
        obj = (Department) super.clone();
        if (null != this.date) {
            obj.date = (Date) this.date.clone();
        }
        return obj;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}

class Checker {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department it = new Department("IT", new Date(12, 3, 12));
        Department cloneOfIt = it.clone();

        System.out.println(it.getName() == cloneOfIt.getName());
        System.out.println(it.getName().equals(cloneOfIt.getName()));
        System.out.println("=========");
        System.out.println(it.getDate() == cloneOfIt.getDate());
        System.out.println(it.getDate().equals(cloneOfIt.getDate()));
    }
}

