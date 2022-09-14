package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "주문정보", path = "주문정보")
public interface 주문정보Repository
    extends PagingAndSortingRepository<주문정보, Long> {
    // keep

}
