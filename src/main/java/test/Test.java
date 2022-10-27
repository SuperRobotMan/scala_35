package test;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Test {
    public static void main(String[] args) {
       /* ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1,10.99,"2022-01-01"));
        orders.add(new Order(2,13.99,"2022-02-01"));
        orders.add(new Order(3,12.99,"2022-04-01"));
        orders.add(new Order(4,14.99,"2022-05-01"));
        orders.add(new Order(5,16.99,"2022-03-01"));
        orders.add(new Order(6,15.99,"2022-07-01"));


        Collections.sort(orders,new MyOrder());
        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println("=====================");

        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return -o1.getOrder_time().compareTo(o2.getOrder_time());
            }
        });

        for (Order order : orders) {
            System.out.println(order);
        }

        Collections.sort(orders);

        System.out.println("=====================");

        for (Order order : orders) {
            System.out.println(order);
        }
*/

        //创建了一个长度为6的数组
        int[] ints = new int[6];
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
}

class MyOrder implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return -Double.compare(o1.getPrice(),o2.getPrice());
    }
}
