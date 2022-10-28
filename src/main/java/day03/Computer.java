package day03;

public class Computer {

    public static double newPrice(double discount){
        return Computer$.MODULE$.newPrice(discount);
    }

    public static int id(){
        return Computer$.MODULE$.id();
    }

    public static void id_eq$(int id){
        Computer$.MODULE$.id_eq$(id);
    }

    public static String brand(){
        return Computer$.MODULE$.brand();
    }

    public static void brand_eq$(String brand){
        Computer$.MODULE$.brand_eq$(brand);
    }

    public static String color(){
        return Computer$.MODULE$.color();
    }

    public static void color_eq$(String color){
        Computer$.MODULE$.color_eq$(color);
    }

    public static double price(){
        return Computer$.MODULE$.price();
    }

    public static void price_eq$(double price){
        Computer$.MODULE$.price_eq$(price);
    }

    public static MyFun0 introduce(){
        return Computer$.MODULE$.introduce();
    }


}
