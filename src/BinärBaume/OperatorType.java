package BinärBaume;

public enum OperatorType {

    ADD{
        double getValue(Node leftValue, Node rightValue){
            return leftValue.getValue() + rightValue.getValue();
        }
    },
    SUBTRACT {
        double getValue(Node leftValue, Node rightValue) {
            return leftValue.getValue() - rightValue.getValue();
        }
    },
    MULTIPLY{
        double getValue(Node leftValue, Node rightValue) {
            return leftValue.getValue() * rightValue.getValue();
        }
    },
    DIVIDE{
        double getValue(Node leftValue, Node rightValue) {
            return leftValue.getValue() / rightValue.getValue();
        }
    },
    POWER{
        double getValue(Node leftValue, Node rightValue) {
            return Math.pow(leftValue.getValue(),rightValue.getValue() );
        }
    };

    abstract double getValue(Node leftValue, Node rightValue);
}
