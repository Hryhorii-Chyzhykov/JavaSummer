package code.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Contains string constants.
 */

public class View {


    public static final ResourceBundle bundle =
            ResourceBundle.getBundle("messages",
                    new Locale("uk", "UA"));  // Ukrainian
                    //new Locale("en", "US"));        // English

    /**
     *
     * @param message text to display on screen.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

}
