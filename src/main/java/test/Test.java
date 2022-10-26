package test;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //scala 内部，底层封装的方法
        Func2<String, Integer, String> func2 = new Func2<String, Integer, String>() {
            @Override
            public String method(String abc, Integer zxy) {
                //把abc 这个字符串转换成Int 类型
                int i = Integer.parseInt(abc);

                return i + zxy + "";
            }
        };

        String method = func2.method("100", 99);
        System.out.println(method);


    }
}
