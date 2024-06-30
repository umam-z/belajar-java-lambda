package zuper.programmer.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        // Function<String, Integer> functionLength = new Function<String, Integer>() {
        // @Override
        // public Integer apply(String t) {
        //         return t.length();
        //     }
        // };

        Function<String, Integer> functionLength = t -> t.length();
        
        System.out.println(functionLength.apply("Mohammad"));
    }
}