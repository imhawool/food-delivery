package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class 주문발생됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String options;
    private String address;
    private List&lt;String&gt; options;
    private String storeId;
}
