package Calculator.Model;

import Calculator.Numbers.Complex;
import Calculator.Numbers.Rational;

public class CalcModel {
    Rational rationalA;
    Rational rationalB;

    Complex complexA;
    Complex complexB;

    public Rational rationalRes(int a1, int b1, int a2, int b2, String op) {
        this.rationalA = new Rational(a1, b1);
        this.rationalB = new Rational(a2, b2);        

        switch (op) {
            case "+":
                
                return new RationalModel(rationalA, rationalB).sum();

            case "-":
                
                return new RationalModel(rationalA, rationalB).minus();  

            case "*":

                return new RationalModel(rationalA, rationalB).mult();

            case "/":

                return new RationalModel(rationalA, rationalB).div();
        
            default:
                return null;
        }
    }

    public Complex complexRes(double a1, double b1, double a2, double b2, String op) {
        this.complexA = new Complex(a1, b1);
        this.complexB = new Complex(a2, b2);        

        switch (op) {
            case "+":
                
                return new ComplexModel(complexA, complexB).sum();

            case "-":
                
                return new ComplexModel(complexA, complexB).minus();  

            case "*":

                return new ComplexModel(complexA, complexB).mult();

            case "/":

                return new ComplexModel(complexA, complexB).div();
        
            default:
                return null;
        }
    }
}
