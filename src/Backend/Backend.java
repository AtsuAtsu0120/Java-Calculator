package Backend;

import Calc.Data;
import Calc.Operator;
import Calc.OperatorEnum;

import java.util.ArrayList;
import java.util.List;

public class Backend {
    private List<Data> data = new ArrayList<>();
    public double number;
    public OperatorEnum operator;
    public Backend(double number) {
        this.number = number;
        operator = OperatorEnum.None;
        AddData();
    }

    public void AddData() {
        var data = new Data(operator, number);
        this.data.add(data);
    }
    // 計算の処理
    public double Calc() {
        var previousNumber = 0.0;
        for (int i = 0; i < data.size(); i++) {
            // データを取り出す。
            var nowData = data.get(i);

            // オペレーターによって、処理を変える。
            var result = 0.0;
            if(nowData.getOperator() == OperatorEnum.Plus) {
                result = Operator.Plus(previousNumber, nowData.getNumber());
            }
            else if(nowData.getOperator() == OperatorEnum.Minus) {
                result = Operator.Minus(previousNumber, nowData.getNumber());
            }
            else if(nowData.getOperator() == OperatorEnum.Multiplied) {
                result = Operator.Multiplied(previousNumber, nowData.getNumber());
            }
            else if(nowData.getOperator() == OperatorEnum.Divided) {
                result = Operator.Divided(previousNumber, nowData.getNumber());
            }
            else if(nowData.getOperator() == OperatorEnum.None) {
                result = nowData.getNumber();
            }
            previousNumber = result;
        }
        //この変数名返すのきもいから修正求
        return previousNumber;
    }
}
