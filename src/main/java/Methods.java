import java.util.Scanner;

public class Methods extends Menu {

    Scanner input = new Scanner(System.in);
    public static double multiplicationOperation(double x, double y) {
        double multiplicationResult = x * y;
        return multiplicationResult;
    }

    public static double additionOperation(double x, double y) {
        double additionResult = x + y;
        return additionResult;
    }

    public static double subtractionOperation(double x, double y){
        double subtractionResult = x - y;
        return subtractionResult;
    }

    public static double dividingOperation(double x, double y){
        double dividingResult = x / y;
        return dividingResult;
    }

}
