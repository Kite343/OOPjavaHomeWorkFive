package Calculator.Model;

import Calculator.Numbers.Complex;

public class ComplexModel extends Model implements Operations<Complex>{
    Complex a;
    Complex b;
    Complex result;

    public ComplexModel(Complex a, Complex b, String operation) {
        super(operation);
        this.a = a;
        this.b = b;
    }

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
    public Complex multiplication() {
        // TODO Auto-generated method stub
        return result;
    }

    @Override
    public Complex division() {
        // TODO Auto-generated method stub
        return result;
    }
    
}
