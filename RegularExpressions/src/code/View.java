package code;

/**
 * Contains string constants.
 */

public class View {

    public static final String INPUT_NAME = "Input name";
    public static final String INPUT_SURNAME = "Input surname";
    public static final String INPUT_PATRONYMIC = "Input patronymic";
    public static final String INPUT_NICK = "Input your nickname";
    public static final String INPUT_COMMENT = "Input comment";
    public static final String WRONG_INPUT = "Wrong input! Try again!";

    /**
     *
     * @param message text to display on screen.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

}
