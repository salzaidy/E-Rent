package com.erent.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "property")
@Data
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private PropertyCategory category;

    @Column(name = "property_address")
    private String propertyAddress;

    @Column(name = "property_built_year")
    private Date propertyBuiltYear;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image_url")
    private  String imageUrl;

}
