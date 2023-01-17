package Calculator.Model;

import Calculator.Numbers.Rational;

public class CalcModel {
    Rational rationalA;
    Rational rationalB;

    public Rational rationalRes(int a1, int b1, int a2, int b2, String op) {
        this.rationalA = new Rational(a1, b1);
        this.rationalB = new Rational(a2, b2);        

        switch (op) {
            case "+":
                
                return new RationalModel(rationalA, rationalB).sum();

            case "-":
                
                return null;  

            case "*":

                return null;

            case "/":

                return null;
        
            default:
                return null;
        }
    }
}
