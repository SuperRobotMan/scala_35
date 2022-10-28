package day03;

public class Test {
    public static void main(String[] args) {
        System.out.println(Computer.id());
        Computer.id_eq$(3);
        System.out.println(Computer.id());


        MyFun0 introduce = Computer.introduce();
        introduce.apply();


    }
}
