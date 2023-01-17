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

    @Override
    public Rational sum() {
        // временное, неправильное сложение
        this.result = new Rational(a.getNominator() + b.getNominator(), a.getDenominator() + b.getDenominator());
        return result;
    }

    @Override
    public Rational minus() {
        
        return result;
    }

    @Override
    public Rational mult() {
        
        return result;
    }

    @Override
    public Rational div() {
        
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
