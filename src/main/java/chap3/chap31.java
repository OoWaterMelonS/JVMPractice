package chap3;

public class chap31 {
    public Object instance = null;

    private static final  int _1MB = 1024*1024;


    private byte[] bigSize = new byte[2*_1MB];

    public static void testGC(){
        chap31 c31 = new chap31();
        chap31 c32 = new chap31();

        c31.instance = c32;
        c32.instance = c31;

        c31 = null;
        c32 = null;

        System.gc();
    }

    public static void main(String[] args) {
        chap31 c31 = new chap31();
        chap31 c32 = new chap31();

        c31.instance = c32;
        c32.instance = c31;

        c31 = null;
        c32 = null;

        System.gc();

        System.out.println();
    }
}


