package Calculator.Model;

public abstract class Model {
    protected String operation;    

    public Model(){
        
    }

    public Model(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
