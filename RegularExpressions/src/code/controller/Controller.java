package code.controller;

import code.model.Model;
import code.model.data.*;
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
        NotebookInput notebookInput = controllerUtilitys.createAndFillNotebook();
        NoteBook noteBook = getNoteBook(notebookInput, controllerUtilitys);
    }
    public NoteBook getNoteBook(NotebookInput notebookInput, ControllerUtilitys controllerUtilitys){
        NoteBook noteBook = null;
        while (true){
            try{
                noteBook = new NoteBook(notebookInput.getName(), notebookInput.getNick());
                break;
            }
            catch (LoginAlreadyExistsException e){
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                notebookInput.setNick(controllerUtilitys.inputData(view.bundle.getString("INPUT_NICK"), view.bundle.getString("NICK_PATTERN")));
            }
        }
        return noteBook;
    }


}
