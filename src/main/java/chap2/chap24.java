package chap2;

public class chap24 {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        chap24 chap24 = new chap24();
        try{
            chap24.stackLeak();
        }catch (Throwable e){
            System.out.println("stackLength: "+chap24.stackLength);
            throw e;
        }
    }
}
