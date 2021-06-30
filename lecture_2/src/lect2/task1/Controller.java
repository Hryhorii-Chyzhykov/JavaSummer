package lect2.task1;


import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner sc = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser (){
        model.setValue();
        model.setUserValue(inputUserValue(sc));
        startGame();
        view.printMessage(String.valueOf(model.getAttempts()));
    }

    public int inputUserValue(Scanner sc){
        view.printMessage(View.ENTER_VALUE + model.getMinValue() + " and " + model.getMaxValue());
        while( ! sc.hasNextInt()) {
            view.printMessage(View.ENTER_AN_INTEGER);
            sc.next();
        }
        return sc.nextInt();

        }

    public void startGame(){
        if (model.getValue() == model.getUserValue())
            view.printMessage(view.WIN);
        else {
            while (model.getUserValue() != model.getValue()) {
                while (!model.checkRange(model.getUserValue())) {
                    view.printMessage(view.OUT_OF_RANGE);
                    model.setUserValue(inputUserValue(sc));
                }
                model.addAttempts(model.getUserValue());
                if (model.getValue() > model.getUserValue()) {
                    view.printMessage(view.BIGGER);
                    model.setMinValue(model.getUserValue());
                }
                if (model.getValue() < model.getUserValue()) {
                    view.printMessage(view.LOWER);
                    model.setMaxValue(model.getUserValue());
                }
                model.setUserValue(inputUserValue(sc));
            }
            model.addAttempts(model.getUserValue());
            view.printMessage(view.WIN);
        }

    }


    }


