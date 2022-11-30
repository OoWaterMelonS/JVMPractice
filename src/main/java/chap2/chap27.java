package chap2;

public class chap27 {
    public static void main(String[] args) {
        String s1 = new StringBuilder("jav").append("a").toString();
        System.out.println(s1.intern()==s1);

        String s = new StringBuilder("12").append("软件").toString();
        System.out.println(s.intern()==s);


    }
}
