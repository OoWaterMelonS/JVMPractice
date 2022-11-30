package chap2;

public class chap25 {

    private void dontstop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontstop();
                }
            });
            t.start();
        }
    }

    public static void main(String[] args) {
        chap25 chap25 = new chap25();
        chap25.stackLeakByThread();
    }
}
