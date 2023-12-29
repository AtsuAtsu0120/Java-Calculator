package Calc;

public class Data {
    private OperatorEnum operator;
    private double number;

    public Data(OperatorEnum operatorEnum, double number) {
        this.operator = operatorEnum;
        this.number = number;
    }
    public OperatorEnum getOperator() {
        return operator;
    }

    public double getNumber() {
        return number;
    }
}
