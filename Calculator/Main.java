package Calculator;

import Calculator.Model.CalcModel;

// import Calculator.Model.RationalModel;

// import Calculator.Numbers.Complex;
// import Calculator.Numbers.Rational;

public class Main {
    public static void main(String[] args){
        // Rational a = new Rational(5, 1);
        // Complex b = new Complex(3, 5);
        // System.out.println(a);
        // System.out.println(b);

        // RationalModel model = new RationalModel();
        // System.out.println(model.getOperation());
        // model.setOperation("+");
        // System.out.println(model.getOperation());
        // model.setA(5, 3);
        // System.out.println(model.getA());

        // Menu menu = new Menu();
        // menu.start();

        CalcModel calk = new CalcModel();
        System.out.println(calk.rationalRes(1, 2, 2, 3, "+"));
    }
}
