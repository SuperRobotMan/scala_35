package test;

/**
 * 这个里面都是静态的
 */
public class Computer {

    public static int id(){
      return Computer$.MODULE$.id();
    }

    public static String brand(){
        return Computer$.MODULE$.brand();
    }

    public static String color(){
        return Computer$.MODULE$.color();
    }

    public static Double price(){
        return Computer$.MODULE$.price();
    }

    public static  MyFunction0 introduce(){
        return Computer$.MODULE$.introduce();
    }

    public static void id_eq$(int id){
        Computer$.MODULE$.id_eq$(id);
    }

    public static void brand_eq$(String brand){
        Computer$.MODULE$.brand_eq$(brand);
    }

    public static void color_eq$(String color){
        Computer$.MODULE$.color_eq$(color);
    }

    public static void price_eq$(double price){
        Computer$.MODULE$.price_eq$(price);
    }

    public static double realPrice(double discount){
       return Computer$.MODULE$.realPrice(discount);
    }

}

class Test1{
    public static void main(String[] args) {
        System.out.println(Computer.brand());
        Computer.brand_eq$("华硕");
        System.out.println(Computer.brand());

        //获取到函数对象
        MyFunction0 introduce = Computer.introduce();
        //调用方法后得到结果
        introduce.apply();

        double salePrice = Computer.realPrice(0.8);
        System.out.println(salePrice);

    }
}
