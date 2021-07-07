package code.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Contains string constants.
 */

public class View {

    //public static final String INPUT_NAME = "Input name";
    //public static final String INPUT_SURNAME = "Input surname";
    //public static final String INPUT_NICK = "Input your nickname";
    //public static final String WRONG_INPUT = "Wrong input! Try again!";

    public static final ResourceBundle bundle =
            ResourceBundle.getBundle("messages",
                    //new Locale("uk", "UA"));  // Ukrainian
                    new Locale("en", "US"));        // English

    /**
     *
     * @param message text to display on screen.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

}
