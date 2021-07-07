package code.controller;

import code.model.Model;
import code.view.View;

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
        ControllerUtilitys controllerUtilitys = new ControllerUtilitys(view, sc);
        Notebook notebook = controllerUtilitys.createAndFillNotebook();
    }


}
