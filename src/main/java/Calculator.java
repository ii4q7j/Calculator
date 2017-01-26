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
            System.out.println("Result is too big to show");
            return Integer.MIN_VALUE;
        }

        return result;


    }
}
