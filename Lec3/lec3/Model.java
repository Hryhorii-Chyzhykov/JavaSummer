package lec3;

import java.util.ArrayList;

public class Model {
    private int value;
    private int userValue;
    private int minValue;
    private int maxValue;
    private ArrayList<Integer> attempts = new ArrayList<>();


    public void setValue(int value) {this.value = value;}
    //public int getValue() {return value;}
    public void setMaxValue(int maxValue) {this.maxValue = maxValue;}
    public int getMaxValue() {return maxValue;}
    public void setMinValue(int minValue) {this.minValue = minValue;}
    public int getMinValue() {return minValue;}
    //public void setUserValue(int userValue) {this.userValue = userValue;}
    //public int getUserValue() {return userValue;}
    public ArrayList getAttempts(){return attempts;}

    public boolean checkValue (int userValue){
        attempts.add(userValue);
        if (value == userValue){
            return false;
        } else if (userValue > value){
            maxValue = userValue;
        } else {
            minValue = userValue;
        }
        return true;
    }

    public int randomValue(){
        return (int)Math.ceil(Math.random()* (maxValue - minValue - 1) + minValue);}

}
