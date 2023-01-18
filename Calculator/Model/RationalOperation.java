package Calculator.Model;

import Calculator.Numbers.Rational;

// не реализовано сокращение дроби

public class RationalOperation{
    public Rational sum(Rational a, Rational b){
        int nom = a.getNominator() * b.getDenominator() + b.getNominator() * a.getDenominator();
        return new Rational(nom, a.getDenominator() * b.getDenominator());
    };

    public Rational minus(Rational a, Rational b){
        int nom = a.getNominator() * b.getDenominator() - b.getNominator() * a.getDenominator();
        return new Rational(nom, a.getDenominator() * b.getDenominator());
    };

    public Rational mult(Rational a, Rational b){
        return new Rational(a.getNominator() * b.getNominator(), a.getDenominator() * b.getDenominator());
    };

    public Rational div(Rational a, Rational b){
        return new Rational(a.getNominator() * b.getDenominator(), a.getDenominator() * b.getNominator());
    };
    
}
