package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class 주문접수됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String status;
    private String orderId;
    private String address;
    private String options;
    private String storeId;
}
