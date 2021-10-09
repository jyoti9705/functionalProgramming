public class LambdaRunnableExample {
    public static void main(String[] args) {
        //prior Java 8//
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //After Java 8
        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnable1).start();

        Runnable runnableLambda = () -> System.out.println("Inside Runnable Lambda 2");
        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Inside runnable single line")).start();

    }
}

