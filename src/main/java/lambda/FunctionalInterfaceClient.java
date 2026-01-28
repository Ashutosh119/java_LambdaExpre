package lambda;

public class FunctionalInterfaceClient {
    public static void main(String[] args) {

        FunIntefaceDemo1 functional =(x) -> x + 5;
//        System.out.println(functional.incrementByFive(2)); //one abstract method implementation

        //default method based implementation
        int result = functional.incrementByFive(21);
        functional.printResult(result);
    }
}
