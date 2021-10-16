package lesson1_homework;

public class Human implements Participant, Runned, Jumped {
    private int weight;
    private int height;
    private int age;
    private int jumpStrange;
    private int runLength;

    public Human(int weight, int height, int age, int jumpStrange, int runLength) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.jumpStrange = jumpStrange;
        this.runLength = runLength;
    }

    public Human (int height) {
        this(12,height, 18, 4, 15);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void Jump() {
        System.out.println("Человек подпрыгнул");
    }

    @Override
    public boolean JumpBarrier(Wall wall) {
        if (wall != null) {
            if (wall.getHeight() < jumpStrange) {
                System.out.println("Человек запрыгнул на стену. Сила прыжка человека " + jumpStrange + ", высота стены " + wall.getHeight());
                return true;
            } else {
                System.out.println("у Человека не получилось запрыгнуть на стену. Сила прыжка человека " + jumpStrange + ", высота стены " + wall.getHeight());
                return false;
            }
        } else {
            Jump();
            return true;
        }
    }

    @Override
    public void Run() {
        System.out.println("Человек устремился");
    }

    @Override
    public boolean RunBarrier(RunningTrack runningTrack) {
        if (runningTrack != null) {
            if (runningTrack.getLength() < runLength) {
                System.out.println("Человек легко бежит по беговой дорожке. Дальность бега человека " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return false;
            } else {
                System.out.println("Человек не может бежать по беговой дорожке. Дальность бега человека " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return true;
            }
        } else {
            Run();
            return false;
        }
    }
}
