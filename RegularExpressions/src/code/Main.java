package code;

/**
 * @author Hrihorii Chyzhykov
 * @version 1.0
 *
 * The Main class implements launching the application using the method main.
 * Initializes the class controller and passes control to it.
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.userProcess();
    }
}
