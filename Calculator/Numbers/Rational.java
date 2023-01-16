package Calculator.Numbers;

public class Rational {
    private int nominator;
    private int denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(int nominator) {
        this(nominator, 1);
    }

    public Rational(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }


    public float getValue() {
        return nominator / (float) denominator;
    }

    @Override
    public String toString() {
        if(denominator == 1){
            return Integer.toString(nominator);
        }
        return nominator + "/" + denominator;
    }
    
}
