package lec3;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
        controller.userProcess();
    }
}
