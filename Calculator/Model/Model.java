package Calculator.Model;

public abstract class Model<T> implements Operations<T>{

    protected T a;
    protected T b;
    protected T result;
    // protected String operation;    

    public Model(){
        
    }

    // public String getOperation() {
    //     return operation;
    // }

    // public void setOperation(String operation) {
    //     this.operation = operation;
    // }

}
