package code.controller;

import code.view.View;

import java.util.Scanner;

public class ControllerUtilitys {
    private View view;
    private Scanner sc;


    public ControllerUtilitys(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public NotebookInput createAndFillNotebook (){
        return new NotebookInput(
                inputData(view.bundle.getString("INPUT_SURNAME"), view.bundle.getString("SURNAME_PATTERN")),
                inputData(view.bundle.getString("INPUT_NAME"), view.bundle.getString("NAME_PATTERN")),
                inputData(view.bundle.getString("INPUT_NICK"), view.bundle.getString("NICK_PATTERN")));
    }

    public String inputData(String message, String regex) {
        view.printMessage(message);
        String userInput;
        while (!(userInput = sc.next()).matches(regex)) {
            view.printMessage(view.bundle.getString("WRONG_INPUT"));
            view.printMessage(message);
        }
        return userInput;
    }
}

