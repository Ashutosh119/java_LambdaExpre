package lambda;

@FunctionalInterface
public interface FunIntefaceDemo1 {
    public int incrementByFive(int a);
    default   void printResult(int result){
        System.out.println("Result is :" + result);
    }
}
