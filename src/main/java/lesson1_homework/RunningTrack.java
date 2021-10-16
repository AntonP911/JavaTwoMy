package lesson1_homework;

public class RunningTrack extends Barrier {
    private int length;

    public RunningTrack(int length, String name) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
