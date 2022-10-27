package test;

import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order implements Comparable<Order>{
    private int id;
    private double price;
    private String order_time;

    @Override
    public int compareTo(Order o) {
        return -(this.id - o.id);
    }
}
