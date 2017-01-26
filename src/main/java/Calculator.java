/**
 * Created by dmitriybala on 26.01.17.
 */
public class Calculator {


    public static int calculate(Double numberOne, Character operand, Double numberTwo) {

        Integer result;

        switch (operand) {
            case '+':
                result = (int) (numberOne + numberTwo);
                break;
            case '-':
                result = (int) (numberOne - numberTwo);
                break;
            case '*':
                result = (int) (numberOne * numberTwo);
                break;
            case '/':
                result = (int) (numberOne / numberTwo);
                break;
            default:
                result = Integer.MIN_VALUE;
        }

        if (result.toString().length() > 8) {
            throw new CalculatorException("Result is too big");
        }

        return result;


    }
}
