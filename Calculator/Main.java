package Calculator;

import Calculator.Controller.Controller;
import Calculator.Model.CalcModel;
import Calculator.Views.ConsoleView;

public class Main {
    public static void main(String[] args){
        
        Controller calk = new Controller(new CalcModel(), new ConsoleView());
        calk.menuCalc();
    }
}
