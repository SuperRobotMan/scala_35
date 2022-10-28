package day03;

public class Computer$ {

    public static Computer$ MODULE$;

    private int id;
    private String brand;
    private String color;
    private double price;

    //函数
    private MyFun0 introduce;


    static {
        new Computer$();
    }


    private Computer$(){
        MODULE$ = this;
        this.id = 2;
        this.brand = "联想";
        this.color = "黑色";
        this.price = 9999.99;

        this.introduce = new MyFun0() {
            @Override
            public void apply() {
                System.out.println("我的品牌是"+brand +",我的颜色是："+color +",我的价格是："+newPrice(0.8));
            }
        };
    }



    public double newPrice(double discount){
        return discount * price;
    }

    public int id() {
        return id;
    }

    public void id_eq$(int id) {
        this.id = id;
    }

    public String brand() {
        return brand;
    }

    public void brand_eq$(String brand) {
        this.brand = brand;
    }

    public String color() {
        return color;
    }

    public void color_eq$(String color) {
        this.color = color;
    }

    public double price() {
        return price;
    }

    public void price_eq$(double price) {
        this.price = price;
    }

    public MyFun0 introduce(){
        return introduce;
    }



}
