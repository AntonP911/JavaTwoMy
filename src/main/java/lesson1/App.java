package lesson1;

public class App {
    public static void main(String[] args) {
        User user = new User(15);
        System.out.println(user.getName());
        System.out.println("currentid = " + User.getCurrentid());

        User user2 = new User("Алексей", 22);
        System.out.println(user2.getName());
        System.out.println("currentid = " + User.getCurrentid());

        Guard guard = new Guard();

        boolean canPass = guard.canPass(user2);
        System.out.println(canPass);
    }
}
