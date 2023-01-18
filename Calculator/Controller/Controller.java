package Calculator.Controller;

import Calculator.Model.CalcModel;
import Calculator.Views.ConsoleView;

public class Controller {
    private CalcModel model;
    private  ConsoleView view;

    public Controller(CalcModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }
    
    void menu(){
        boolean start = true;
        
    };
    
}
