package linkedin.functional.programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiFunction;

public class DoMathWithLambdaExpression {
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(10);
    HashSet<Integer> set = new HashSet<>(10);
    public static final String ADD = "ADD";
    public static final String SUBTRACT = "SUBTRACT";
    public static final String MULTIPLY = "MULTIPLY";
    public static final String DIVIDE = "DIVIDE";

    // Do mathematical calculations using lambda expressions
    public static Map<String, Float> calculate(float value1, float value2) {
        // Your code goes here
        // Create 4 instances of the BiFunction interface referencing lambda expressions
        BiFunction<Float, Float, Float> add = Float::sum;
        BiFunction<Float, Float, Float> sub = (a, b) -> a - b;
        BiFunction<Float, Float, Float> mul = (a, b) -> a * b;
        BiFunction<Float, Float, Float> div = (a, b) -> a / b;

        // Map object for holding the results
        Map<String, Float> results = new HashMap<>();
        results.put(ADD, add.apply(value1, value2));
        results.put(SUBTRACT, sub.apply(value1, value2));
        results.put(MULTIPLY, mul.apply(value1, value2));
        results.put(DIVIDE, div.apply(value1, value2));

        // Populate the map here with the results of the 4 math operations
        return results;
    }

    public static void main(String[] args) {
        Map<String, Float> results = DoMathWithLambdaExpression.calculate(10F, 15);
        System.out.println(results);
    }
}