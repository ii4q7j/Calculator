/**
 * Created by dmitriybala on 26.01.17.
 */
public class Main {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.exit(1);
        }

        System.out.println( Calculator.calculate(Double.parseDouble(args[0]), args[1].charAt(0), Double.parseDouble(args[2])));

    }
}
