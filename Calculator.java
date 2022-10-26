import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }


    static double divide(double... operands) {
        return DoubleStream.of(operands)
                .reduce((a, b) -> a / b)
                .orElse(0);
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
            System.out.println("Hello, World!");
    }


}