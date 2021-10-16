package lesson1.interfaces;

public class Student implements Studyable, Workable {
    @Override
    public void study() {
        System.out.println("Студент учится только перед сессией");
    }

    @Override
    public void work() {
        System.out.println("Студент еще и работает");
    }
}
