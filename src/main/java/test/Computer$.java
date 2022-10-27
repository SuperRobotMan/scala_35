package test;

import java.time.temporal.ChronoUnit;

public class Computer$ {
    public static Computer$ MODULE$;
    private int id ;
    private String brand;
    private String color;
    private double price;
    private MyFunction0 introduce;

    static {
      new Computer$();
    }

    //构造方法私有化
    private Computer$(){
        //把上面静态代码块中创建出来的对象赋值给了全局唯一的对象
        MODULE$ = this;
        this.id = 1;
        this.brand = "联想";
        this.color = "黑色";
        this.price = 9999.99;
        this.introduce = new MyFunction0() {
            @Override
            public void apply() {
                double realPrice = realPrice(0.8);
                System.out.println("我的品牌是："+brand +"我的颜色是："+color +",我的价格是："+realPrice);
            }
        };
    }

    public int id(){
        return this.id;
    }

    public String brand(){
        return this.brand;
    }

    public String color(){
        return this.color;
    }

    public Double price(){
        return this.price;
    }

    public void id_eq$(int id){
        this.id = id;
    }

    public void brand_eq$(String brand){
        this.brand = brand;
    }

    public void color_eq$(String color){
        this.color = color;
    }

    public void price_eq$(Double price){
        this.price = price;
    }

    //成员方法
    public double realPrice(double discount){
        return discount * this.price;
    }

    //函数
    public MyFunction0 introduce(){
        return this.introduce;
    }


}
