package Calculator.Model;

import Calculator.Numbers.Rational;

public class RationalModel extends Model<Rational>{

    // public RationalModel(){
    // }

    public RationalModel(Rational a, Rational b) {
        this.a = a;
        this.b = b;
    }
   
    // public void setA(int x, int y) {
    //     super.a = new Rational(x, y);
    // }
    
    // public void setB(int x, int y) {
    //     super.b = new Rational(x, y);
    // }

    
    // не реализовано сокращение дроби
    @Override
    public Rational sum() {
        int nom = a.getNominator() * b.getDenominator() + b.getNominator() * a.getDenominator();
        super.result = new Rational(nom, a.getDenominator() * b.getDenominator());
        return result;
    }

    @Override
    public Rational minus() {
        int nom = a.getNominator() * b.getDenominator() - b.getNominator() * a.getDenominator();
        super.result = new Rational(nom, a.getDenominator() * b.getDenominator());
        return result;
    }

    @Override
    public Rational mult() {
        super.result = new Rational(a.getNominator() * b.getNominator(), a.getDenominator() * b.getDenominator());
        return result;
    }

    @Override
    public Rational div() {
        super.result = new Rational(a.getNominator() * b.getDenominator(), a.getDenominator() * b.getNominator());
        return result;
    }    
    
    // public Rational getResult() {
    //     switch (super.operation) {
    //         case "+":
                
    //             break;

    //         case "-":
                
    //             break;  

    //         case "*":

    //             break;

    //         case "/":

    //             break;
        
    //         default:
    //             return null;
    //     }
    //     return result;
    // }  

}
