package lesson1_homework;

public class App {
    public static void main(String[] args) {
        Human human = new Human(84, 185, 29, 150, 25);
        Cat cat = new Cat(2, true, 200, 100);
        Robot robot = new Robot("Anton", 150, false,100, 75);

        Wall wall = new Wall(160, "Стена 1");
        RunningTrack rt = new RunningTrack(5, "Беговая дорожка 1");

        //Задание 1
        robot.Run();
        robot.Jump();
        human.Run();
        human.Jump();
        cat.Run();
        cat.Jump();

        //Загоняем в массив участников (кот, человек, робот)
        Participant[] participants = new Participant[3];
        participants[0] = cat;
        participants[1] = human;
        participants[2] = robot;

        //Загоняем в массив препятствие (стена, беговая дорожка)
        Barrier[] barriers = new Barrier[2];
        barriers[0] = wall;
        barriers[1] = rt;

        //Каждый участник проходит через препятствия
        for (Participant participant: participants) {//Для каждого участника
            for (Barrier barrier: barriers) {//Для каждого препятствия
                if (barrier instanceof Wall) { //Если препятствие стена
                    if (participant instanceof Cat) { //Если участник кот
                      if (!((Cat) participant).JumpBarrier(((Wall) barrier))) {
                          System.out.println("Кот выбывает из участия");
                          break;
                      }
                    } else if (participant instanceof Human) { //Иначе если участник человек
                        if (! ((Human) participant).JumpBarrier(((Wall) barrier))) {
                            System.out.println("Человек выбывает из участия");
                            break;
                        }
                    } else if (participant instanceof Robot) { //Иначе если участник робот
                        if (!((Robot) participant).JumpBarrier(((Wall) barrier))) {
                            System.out.println("Робот выбывает из участия");
                            break;
                        }
                    }
                } else if (barrier instanceof RunningTrack) {
                    if (participant instanceof Cat) {
                        if (!((Cat) participant).RunBarrier(((RunningTrack) barrier))) {
                            System.out.println("Кот выбывает из участия");
                            break;
                        }
                    } else if (participant instanceof Human) {
                        if (!((Human) participant).RunBarrier(((RunningTrack) barrier))) {
                            System.out.println("Человек выбывает из участия");
                            break;
                        }
                    } else if (participant instanceof Robot) {
                        if (!((Robot) participant).RunBarrier(((RunningTrack) barrier))) {
                            System.out.println("Робот выбывает из участия");
                            break;
                        }
                    }
                }
            }
        }

    }
}
