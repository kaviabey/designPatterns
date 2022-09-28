package Mediater;

public class MediatorDemoPattern {

    public static void main(String[] args) {

        User Robert  = new User("Robert");
        User john = new User("John");

    Robert.sendMessage("Hi! John ");
    john.sendMessage("Hello ! Roberrt");
    }
}
