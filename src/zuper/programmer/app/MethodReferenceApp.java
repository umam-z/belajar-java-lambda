package zuper.programmer.app;

import java.util.function.Function;
import java.util.function.Predicate;

import zuper.programmer.util.StringUtil;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicateIsLowercase = new Predicate<String>() {
        //     @Override
        //     public boolean test(String t) {
        //         return StringUtil.isLowerCase(t);
        //     }
        // };

        // Predicate<String> predicateIsLowercase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowercase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowercase.test("Mohammad"));
        System.out.println(predicateIsLowercase.test("umam"));

        // method reference di parameter
        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Mohammad"));
    }

    public void run() {
        // Predicate<String> predicateIsLowercase = MethodReferenceApp.this::isLowerCase;

        // jika ingin menggunakan object yang sama this
        Predicate<String> predicateIsLowercase = this::isLowerCase;

        System.out.println(predicateIsLowercase.test("Mohammad"));
        System.out.println(predicateIsLowercase.test("umam"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        
        Predicate<String> predicateIsLowercase = app::isLowerCase;

        System.out.println(predicateIsLowercase.test("Mohammad"));
        System.out.println(predicateIsLowercase.test("umam"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
