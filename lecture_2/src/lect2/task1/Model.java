package lect2.task1;

import java.util.ArrayList;

public class Model {
    private int value;
    private int userValue;
    private int minValue = 0;
    private int maxValue = 100;
    private ArrayList<Integer> attempts = new ArrayList<>();

    public void setValue(){this.value = (int) (Math.random() * ++maxValue); --maxValue;}
    public int getValue() {return value;}
    public void setMaxValue(int maxValue) {this.maxValue = maxValue;}
    public int getMaxValue() {return maxValue;}
    public void setMinValue(int minValue) {this.minValue = minValue;}
    public int getMinValue() {return minValue;}
    public void setUserValue(int userValue) {this.userValue = userValue;}
    public int getUserValue() {return userValue;}
    public boolean checkRange (int userValue){
        if (userValue >= minValue && userValue <= maxValue){
            return true;}
        return false;
    }
    public void addAttempts (int value){
        attempts.add(value);
    }
    public ArrayList getAttempts(){return attempts;}
}
