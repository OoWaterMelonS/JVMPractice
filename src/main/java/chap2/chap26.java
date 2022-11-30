package chap2;

import java.util.ArrayList;

public class chap26 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        int i = 0;
        while (true){
            strings.add(String.valueOf(i).intern());
        }
    }
}


