package test;


import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hero {
    private int id;
    private String name;
    private int power;
    private int faceValue;
}
