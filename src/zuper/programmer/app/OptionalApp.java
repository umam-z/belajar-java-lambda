package zuper.programmer.app;

import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Mohammad");

        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        // Optional<String> nameOptional = Optional.ofNullable(name);

        // without lamda
        // Optional<String> nameOptionalUpper = nameOptional.map(new Function<String, String>() {
        //     public String apply(String t) {
        //         return t.toUpperCase();
        //     };
        // });

        // lamda
        // Optional<String> nameOptionalUpper = nameOptional.map(value -> value.toUpperCase());

        // nameOptionalUpper.ifPresent(new Consumer<String>() {
        //     public void accept(String t) {
        //         System.out.println("HELLO " + t);
        //     };
        // });
        
        // lamda
        // nameOptionalUpper.ifPresent(t -> System.out.println("HELLO " + t));
        
        
        // if (name != null) {
        //     String nameUpper = name.toUpperCase();
        //     System.out.println("HELLO " + nameUpper);            
        // }

        // menggabungkan dalam satu rantai script (menggunakan lamda)
        // Optional.ofNullable(name)
        // .map(value -> value.toUpperCase())
        // .ifPresent(value -> System.out.println(value));
        
        // menggabungkan dalam satu rantai script (menggunakan lamda method reference)
        // Optional.ofNullable(name)
        // .map(String::toUpperCase)
        // .ifPresent(value -> System.out.println(value));

        // menggabungkan dalam satu rantai script ifPresentorElse
        // Optional.ofNullable(name)
        // .map(String::toUpperCase)
        // .ifPresentOrElse(
        //     value -> System.out.println(value),
        //     () -> System.out.println("Hello")
        // );

        // menggabungkan dalam satu rantai script orElse
        String upperName = Optional.ofNullable(name)
        .map(String::toUpperCase)
        .orElse( "TEMAN");
        System.out.println("HELLO " + upperName);
    }
}
