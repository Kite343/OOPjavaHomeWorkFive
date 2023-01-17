package Calculator.Model;

import Calculator.Numbers.Complex;
import Calculator.Numbers.Rational;

// Два типа реализации- один на примере комплексных, другой на примере рациональных. какой вариант правильный?
public class CalcModel {
    Rational rationalA = new Rational();
    Rational rationalB = new Rational();
    RationalOperation rOperation = new RationalOperation();

    Complex complexA;
    Complex complexB;

    public Rational rationalRes(int a1, int b1, int a2, int b2, String op) {
        // this.rationalA = new Rational(a1, b1);
        // this.rationalB = new Rational(a2, b2);     
        this.rationalA.setNominator(a1);
        this.rationalA.setDenominator(b1);
        this.rationalB.setNominator(a2);
        this.rationalB.setDenominator(b2);

        switch (op) {
            case "+":
                
                return rOperation.sum(rationalA, rationalB);

            case "-":
                
                return rOperation.minus(rationalA, rationalB);  

            case "*":

                return rOperation.mult(rationalA, rationalB);

            case "/":

                return rOperation.div(rationalA, rationalB);
        
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
