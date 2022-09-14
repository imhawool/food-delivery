package fooddelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "주문정보_table")
@Data
public class 주문정보 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String status;
}
