package Calculator.Model;

import Calculator.Numbers.Complex;

public class ComplexModel extends Model<Complex>{

    public ComplexModel(Complex a, Complex b) {
        this.a = a;
        this.b = b;
    }

    // public void setA(double x, double y) {
    //     super.a = new Complex(x, y);
    // }
        
    // public void setB(double x, double y) {
    //     super.b = new Complex(x, y);
    // }

    @Override
    public Complex sum() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Complex minus() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Complex mult() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Complex div() {
        // TODO Auto-generated method stub
        return result;
    }
    
}
