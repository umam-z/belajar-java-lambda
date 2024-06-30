package zuper.programmer.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(70, () -> getName());
    }

    public  static void testScore(int score, Supplier<String> name) {
        if (score > 60) {
            System.out.println("Selamat " +  name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("memanggil getName()");
        return "Mohammad";
    }
}
