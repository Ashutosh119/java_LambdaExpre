package lambda;

public class RunnableExm {

    public static void main(String[] args) {
        Runnable rnb = () ->{
            int sum =0;
            for (int i=0; i< 10; i++)
                sum +=i;
            System.out.println("runnable " + sum);
        };
        new Thread(rnb).start();

    }
}
