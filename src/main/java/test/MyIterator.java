package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * 将取数据的具体逻辑封装起来，对外提供一个可以获取数据的方法，hasNext和next方法来获取数据
 */
//我现在是需要把hero.txt的数据读出来，一次读出来一行，然后封装在Hero这个类里面，返回一个Hero对象

/**
 * 写一个迭代器，然后从mysql数据库中的一张表里面把数据读出来，调用一次，返回一行数据，然后封装在类中
 */
public class MyIterator implements Iterator<Hero> {

    private BufferedReader bufferedReader = null;
    private String line = null;
    /**
     * 1，首先第一步需要读取文件
     * 2.重写hasNext方法
     * 3.重写next方法
     */

    public MyIterator(){
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/resources/hero.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        //如果还有下一行还有数据，就返回true，如果下一行没有数据，就返回false
        //如何判断下一行还有数据
        try {
            line = bufferedReader.readLine();
            if (line != null){
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Hero next() {
        //如果下一行有数据，我才会进入到这个next方法中来，这边就是为了返回我下一行的值
        //5_baozouluoli,120:60
        String[] s = line.split("_");
        String id = s[0];
        //baozouluoli,120:60
        String[] arr = s[1].split(",");
        String name = arr[0];
        //120:60
        String[] split = arr[1].split(":");
        String power = split[0];
        String faceValue = split[1];
        return new Hero(Integer.parseInt(id),name,Integer.parseInt(power),Integer.parseInt(faceValue));
    }
}
