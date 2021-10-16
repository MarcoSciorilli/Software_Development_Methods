package it.units.sdm;

import javax.swing.JOptionPane;

public class Calculator {

    private final Display display;
    private String string;

    public Calculator(Display display) {
        this.display = display;
        string = "";
    }

    public void zeroPressed() {
        string += "0";
        display.display(string);
    }

    public static void main (String[] args){
        Calculator calculator = new Calculator(new ConsoleDisplay());
        calculator.zeroPressed();
        calculator.zeroPressed();
    }




}

class ConsoleDisplay implements Display {

    @Override
    public  void display(String text){
        System.out.println(text);
    }
}

class PopupDisplay implements Display{

    @Override
    public void display(String text){
        JOptionPane.showMessageDialog( null, text);
    }
}