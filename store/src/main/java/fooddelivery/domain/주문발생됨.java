package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문발생됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String options;
    private String address;
    private Object options;
    private String storeId;
    // keep

}
