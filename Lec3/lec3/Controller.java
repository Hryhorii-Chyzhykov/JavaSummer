package lec3;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void userProcess (){
        Scanner sc = new Scanner(System.in);
        model.setMaxValue(GlobalConstsnts.MAX_GLOBAL_VALUE);
        model.setMinValue(GlobalConstsnts.MIN_GLOBAL_VALUE);
        model.setValue(model.randomValue());
        while (model.compareValue(inputUserValue(sc)));
        view.printMessage(String.valueOf(model.getAttempts()));
        view.printMessage(view.WIN);

    }
    public int inputUserValue(Scanner sc) {

        int res;
        while (true) {
            view.printMessage(View.ENTER_VALUE + model.getMinValue() + " and " + model.getMaxValue());
            while (!sc.hasNextInt()) {
                view.printMessage(View.ENTER_AN_INTEGER);
                sc.next();
            }
            res = sc.nextInt();
            if (res >= model.getMinValue() && res <= model.getMaxValue()){
                return res;}
            else view.printMessage(view.OUT_OF_RANGE);


        }
    }
}
