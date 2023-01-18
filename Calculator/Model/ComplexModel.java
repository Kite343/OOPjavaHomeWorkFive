package Calculator.Model;

import Calculator.Numbers.Complex;

public class ComplexModel extends Model<Complex>{

    public ComplexModel(Complex a, Complex b) {
        super.a = a;
        super.b = b;
    }

    // public void setA(double x, double y) {
    //     super.a = new Complex(x, y);
    // }
        
    // public void setB(double x, double y) {
    //     super.b = new Complex(x, y);
    // }

    
    // логика не прописана, установлены временные значения для проверки работы
    @Override
    public Complex sum() {
        super.result = new Complex(a.getReal() + b.getReal(),a.getImage() + b.getImage());        
        return result;
    }

    @Override
    public Complex minus() {
        super.result = new Complex(a.getReal() - b.getReal(),a.getImage() - b.getImage());
        return result;
    }

    @Override
    public Complex mult() {
        double newR = a.getReal() * b.getReal() - a.getImage() * b.getImage();
        double newI = a.getReal() * b.getImage() + a.getImage() * b.getReal();
        super.result = new Complex(newR, newI);
        return result;
    }

    @Override
    public Complex div() {
        double newR = (a.getReal() * b.getReal() + a.getImage() * b.getImage()) / (b.getReal() * b.getReal() + b.getImage() * b.getImage());
        double newI = (a.getImage() * b.getReal() - a.getReal() * b.getImage()) / (b.getReal() * b.getReal() + b.getImage() * b.getImage());
        super.result = new Complex(newR, newI);
        return result;
    }
    
}
