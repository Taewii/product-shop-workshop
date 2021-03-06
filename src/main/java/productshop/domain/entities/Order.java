package productshop.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends BaseUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User customer;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "is_finalized", nullable = false)
    private boolean isFinalized;
}
