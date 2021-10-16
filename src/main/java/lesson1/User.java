package lesson1;

public class User {
    private static int currentid = 0;
    private int id;
    private int age;
    private String name;

    public User(String name, int age) {
        this.id = currentid;
        currentid++;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int age) {
        this("default name", age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCurrentid() {
        return currentid;
    }
}
