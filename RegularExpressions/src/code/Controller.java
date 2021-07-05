package code;

import java.util.Scanner;

public class Controller {
    Scanner sc;
    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        this.sc = new Scanner(System.in);
    }

    public void userProcess(){
       Notebook notebook = new Notebook(
               inputData(view.INPUT_SURNAME, GlobalConstants.SURNAME_PATTERN),
               inputData(view.INPUT_NAME, GlobalConstants.NAME_PATTERN),
               inputData(view.INPUT_PATRONYMIC, GlobalConstants.PATRONYMIC_PATTERN),
               inputData(view.INPUT_NICK, GlobalConstants.NICK_PATTERN),
               inputData(view.INPUT_COMMENT, GlobalConstants.COMMENT_PATTERN));


    }
    public String inputData(String message, String regex){
        view.printMessage(message);
        String userInput;
        while (!isValid(userInput = sc.next(), regex)){
            view.printMessage(view.WRONG_INPUT);
            view.printMessage(message);}
        return userInput;
    }
    public boolean isValid(String input, String regex){
        return input.matches(regex);
    }
}
