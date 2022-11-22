package BinärBaume;

public class Operator implements Node {

    private OperatorType operator;
    private Node leftValue;
    private Node rightValue;

    public Operator(Node leftValue, Node rightValue, OperatorType operator){
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.operator = operator;
    }

    @Override
    public double getValue() {
        return this.operator.getValue(this.leftValue, this.rightValue);
    }
}
