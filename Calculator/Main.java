package Calculator;

import Calculator.Controller.Controller;
import Calculator.Model.CalcModel;
import Calculator.Views.ConsoleView;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        
        Controller calk = new Controller(new CalcModel(), new ConsoleView());
        calk.menuCalc();
    }
}
