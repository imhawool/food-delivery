package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 결제됨 extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    // keep

}
