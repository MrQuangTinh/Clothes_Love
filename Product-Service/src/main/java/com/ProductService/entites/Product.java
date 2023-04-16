package com.ProductService.entites;

import com.ProductService.Enum.SizeStatus;
import com.ProductService.Enum.SizeStatusConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    private Integer quantity;

    @Convert(converter = SizeStatusConverter.class)
    private SizeStatus size;
}

/**
 * Annotation @Enumerated sẽ đánh dấu field được lưu dạng enum, khi lưu vào database và đọc từ database ra,
 * nó sẽ tự động lấy name của Enum đó.
 * Ở đây mình dùng @Convert
 * */
