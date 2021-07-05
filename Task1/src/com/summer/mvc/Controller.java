package com.summer.mvc;

import java.io.*;

public class Controller {

    public static final String FIRST_PART = "Hello";
    public static final String SECOND_PART = "World!";

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser () throws IOException {

        model.setValue(inputData(FIRST_PART, view.WRONG_INPUT_STR_FIRST) + " ");
        model.setValue(inputData(SECOND_PART, view.WRONG_INPUT_STR_SECOND));
        view.printMessage(model.getValue());
    }

    public String inputData(String compare, String errorConst) throws IOException {
        String input ="";
        while (! compare.equals(input)){
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            input = read.readLine();
            if (! compare.equals(input)) view.printMessage(errorConst);
        }
        return input;
    }



}
