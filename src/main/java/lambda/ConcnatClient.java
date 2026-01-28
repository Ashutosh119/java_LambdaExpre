package lambda;

public class ConcnatClient {
    public static void main(String[] args) {

        Concnat ct = (a, b) -> a + b;
        System.out.println(ct.hello("hello ", " World"));
    }
}
