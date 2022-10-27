package test;


import lombok.*;


/**
 * 定义一个标准的javaBean 需要满足哪些条件？？？？
 * 1.属性
 * 2.成员方法
 * 3.构造方法  空参，全参
 * 4.get和set方法
 * 5.toString  hashcode  equals
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private String friend;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age,String friend) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friend = friend;
    }



    public int id() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void name$(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
