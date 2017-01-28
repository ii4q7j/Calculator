/**
 * Created by dmitriybala on 26.01.17.
 */
public class Calculator {


    public static long calculate(double numberOne, char operand, double numberTwo) {

        long result;

        switch (operand) {
            case '+':
                result = Math.round(numberOne + numberTwo);
                break;
            case '-':
                result = Math.round(numberOne - numberTwo);
                break;
            case '*':
                result = Math.round(numberOne * numberTwo);
                break;
            case '/':
                result = Math.round(numberOne / numberTwo);
                break;
            default:
                throw new CalculatorException("Unsupported operator");
        }

        if (String.valueOf(result).length() > 8) {
            throw new CalculatorException("Result is too big");
        }

        return result;


    }
}
