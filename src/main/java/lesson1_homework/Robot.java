package lesson1_homework;

public class Robot implements Participant, Jumped, Runned {
    private String whoCreator;
    private int height;
    private boolean isBattle;
    private int jumpStrange;
    private int runLength;

    public Robot(String whoCreator, int height, boolean isBattle, int jumpStrange, int runLength) {
        this.whoCreator = whoCreator;
        this.height = height;
        this.isBattle = isBattle;
        this.jumpStrange = jumpStrange;
        this.runLength = runLength;
    }

    public String getWhoCreator() {
        return whoCreator;
    }

    public void setWhoCreator(String whoCreator) {
        this.whoCreator = whoCreator;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isBattle() {
        return isBattle;
    }

    public void setBattle(boolean battle) {
        isBattle = battle;
    }

    @Override
    public void Jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public boolean JumpBarrier(Wall wall) {
        if (wall != null) {
           if (wall.getHeight() < jumpStrange) {
               System.out.println("Робот запрыгнул на стену. Сила прыжка робота " + jumpStrange + ", высота стены " + wall.getHeight());
               return true;
           } else {
               System.out.println("у Робота не получилось запрыгнуть на стену. Сила прыжка робота " + jumpStrange + ", высота стены " + wall.getHeight());
               return false;
           }
        } else {
            Jump();
            return true;
        }
    }

    @Override
    public void Run() {
        System.out.println("Робот бегает");
    }

    @Override
    public boolean RunBarrier(RunningTrack runningTrack) {
        if (runningTrack != null) {
            if (runningTrack.getLength() < runLength) {
                System.out.println("Робот спокойно бежит по беговой дорожке. Дальность бега робота " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return false;
            } else {
                System.out.println("Робот не смог пробежать по беговой дорожке. Дальность бега робота " + runLength + ", длина беговой дорожки " + runningTrack.getLength());
                return true;
            }
        } else {
            Run();
            return false;
        }
    }
}
