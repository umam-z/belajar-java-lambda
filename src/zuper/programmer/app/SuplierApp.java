package zuper.programmer.app;

import java.util.function.Supplier;

public class SuplierApp {
    public static void main(String[] args) {
        // Supplier<String> supplier = new Supplier<String>() {
        //     @Override
        //     public String get() {
        //         return "Mohammad";
        //     }
        // };

        Supplier<String> supplier = () -> "Mohammad";

        System.out.println(supplier.get());
    }
}
