package Calculator.Model;

import Calculator.Numbers.Rational;

public class RationalModel extends Model implements Operations<Rational>{

    Rational a;
    Rational b;
    Rational result;
    public RationalModel(){

    }

    // public RationalModel(Rational a, Rational b, String operation) {
    //     super(operation);
    //     this.a = a;
    //     this.b = b;
    // }

    // public Rational getA() {
    //     return a;
    // }

    public void setA(Rational a) {
        this.a = a;
    }

    public void setA(int x, int y) {
        this.a = new Rational(x, y);
    }
    
    // public Rational getB() {
    //     return b;
    // }

    public void setB(Rational b) {
        this.b = b;
    }

    public void setB(int x, int y) {
        this.b = new Rational(x, y);
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

    @Override
    public Rational sum() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Rational minus() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Rational multiplication() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Rational division() {
        // TODO Auto-generated method stub
        return result;
    }

}
