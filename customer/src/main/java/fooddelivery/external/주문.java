package fooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class 주문 {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String storeId;
    // keep

}
