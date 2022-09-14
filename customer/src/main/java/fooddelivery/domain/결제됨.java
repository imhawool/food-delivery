package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class 결제됨 extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
}
