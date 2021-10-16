package lesson1_homework;

public class Wall extends Barrier {
    private int height;

    public Wall(int height, String name) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
