package com.OrderService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_number")
    private String orderNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> orderLineItemsList;
}
/** CascadeType = ALL: Thì nó áp dụng tất cả các kiểu CasscadeType: Persit, Merge, Remove, Detached, Refresh, All
 *
 *  Thế nên khi dùng All thì mình cập nhật ở thằng One thì thằng Many cũng sẽ được cập nhật
 * thì khi tạo mới thằng Cha và chứa luôn giá trị của thằng Con thì nó sẽ tự động lưu luôn cho cả thằng Con
 *
 * */
