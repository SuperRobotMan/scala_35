package test;

import java.util.Iterator;

public class MyIterable implements Iterable<Hero>{
    //iterable里面必然会有一个iterator
    @Override
    public Iterator<Hero> iterator() {
        return new MyIterator();
    }
}
