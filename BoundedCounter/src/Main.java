public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock(0, 0,  0);

        int i = 0;
        while(true) {
            System.out.println( clock );
            clock.tick();
            i++;
            Thread.sleep(1000);
        }
    }
}
  