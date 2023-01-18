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
    
    public void menuCalc(){
        boolean start;
        String text = "Начать работу с калькулятором?\n1 - да \n2 - нет";
        start = startCalc(text);
        while (start){
            chooseCalkNum();
            text = "Продолжить работу с калькулятором?\n1 - да \n2 - нет";
            start = startCalc(text);
        }

    };

    private boolean startCalc(String text){
        switch (view.getValueInt(text)) {
            case 1:
                return true;

            case 2:
                return false;
        
            default:
                view.print("ошибка. не верный выбор");
                return false;
        }
    }

    private void chooseCalkNum(){
        switch (view.getValueInt("Выберите тип чисел:\n1 - Рациональные \n2 - Комплексные")) {
            case 1:
                RationalCalc();
                break;

            case 2:
                ComplexCalc();
                break;
        
            default:
                view.print("ошибка. не верный выбор типа чисел");
                break;
        }
    }

    private void RationalCalc() {
        //  необходима проверка знаменателя на ноль
        view.print("Введите первое число");
        int a1 = view.getValueInt("числитель: ");
        int b1 = view.getValueInt("знаменатель: ");
        String op = view.getValueStr("Введите действие: +, -, *, /");
        view.print("Введите второе число");
        int a2 = view.getValueInt("числитель: ");
        int b2 = view.getValueInt("знаменатель: ");

        switch (op) {
            case "+":
                view.print("= " + model.rationalRes(a1, b1, a2, b2, "+"));
                break;

            case "-":
                view.print("= " + model.rationalRes(a1, b1, a2, b2, "-"));
                break;

            case "*":
                view.print("= " + model.rationalRes(a1, b1, a2, b2, "*"));
                break;

            case "/":
                view.print("= " + model.rationalRes(a1, b1, a2, b2, "/"));
                break;        
        
            default:
                view.print("ошибка. нет такого действия");
                break;
        }
        
        // view.print("= " + model.rationalRes(a1, b1, a2, b2, op));        
    }

    private void ComplexCalc() {
        view.print("Введите первое число");
        double a1 = view.getValueDouble("действительная часть:: ");
        double b1 = view.getValueDouble("мнимая часть: ");
        String op = view.getValueStr("Введите действие: +, -, *, /");
        view.print("Введите второе число");
        double a2 = view.getValueDouble("действительная часть:: ");
        double b2 = view.getValueDouble("мнимая часть: ");

        switch (op) {
            case "+":
                view.print("= " + model.complexRes(a1, b1, a2, b2, "+"));
                break;

            case "-":
                view.print("= " + model.complexRes(a1, b1, a2, b2, "-"));
                break;

            case "*":
                view.print("= " + model.complexRes(a1, b1, a2, b2, "*"));
                break;

            case "/":
                view.print("= " + model.complexRes(a1, b1, a2, b2, "/"));
                break;        
        
            default:
                view.print("ошибка. нет такого действия");
                break;
        }
        
        // view.print("= " + model.complexRes(a1, b1, a2, b2, op));
        
    }

    
}
