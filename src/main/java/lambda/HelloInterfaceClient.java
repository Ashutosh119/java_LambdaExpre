package lambda;

public class HelloInterfaceClient {

    public static void main(String[] args) {
        HelloInterface helloInterface = () -> {
            return  "hello Lambda Interface";
        };
        System.out.println(helloInterface.sayHelloInterface());
    }
}
