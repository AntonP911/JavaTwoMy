package lesson1_homework;

public class Cat implements Participant, Jumped, Runned {
    private int age;
    private boolean isMan;
    private int jumpStrange;
    private int runLength;

    public Cat(int age, boolean isMan, int jumpStrange, int runLength) {
        this.age = age;
        this.isMan = isMan;
        this.jumpStrange = jumpStrange;
        this.runLength = runLength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    @Override
    public void Jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public boolean JumpBarrier(Wall wall) {
        if (wall != null) {
            if (wall.getHeight() < jumpStrange) {
                System.out.println("Кот запрыгнул на стену. Сила прыжка у кота " + jumpStrange + ", высота стены " + wall.getHeight());
                return true;
            } else {
                System.out.println("у Кота не получилось запрыгнуть на стену. Сила прыжка у кота " + jumpStrange + ", высота стены " + wall.getHeight());
                return false;
            }
        } else {
            Jump();
            return true;
        }
    }

    @Override
    public void Run() {
        System.out.println("Кот побежал");
    }

    @Override
    public boolean RunBarrier(RunningTrack runningTrack) {
        if (runningTrack != null) {
            if (runningTrack.getLength() < runLength) {
                System.out.println("Кот успешно бежит по беговой дорожке. Дальность бега кота " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return false;
            } else {
                System.out.println("Кот не может по беговой дорожке. Дальность бега кота " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return true;
            }
        } else {
            Run();
            return false;
        }
    }
}
