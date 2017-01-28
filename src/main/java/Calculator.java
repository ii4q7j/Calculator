import java.lang.reflect.Array;
import java.util.Arrays;

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

                if (numberTwo == 0) {
                    throw new CalculatorException("Can't divide zero");
                }

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

    public static void main(String[] args) {

        if (args.length != 3) {
            System.exit(1);
        }

        System.out.println(Calculator.calculate(Double.parseDouble(args[0]), args[1].charAt(0), Double.parseDouble(args[2])));

    }
}
