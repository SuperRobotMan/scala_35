package test;

import lombok.*;


public class Test {
    public static void main(String[] args) {

        Zss zss = new Zss(1, "zss");
        System.out.println(zss);


    }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
class Zss{
    private int id;
    private String name;
}
