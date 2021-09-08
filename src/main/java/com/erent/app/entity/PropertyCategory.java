package com.erent.app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "property_category")
// @Data -- known bug
@Getter
@Setter
public class PropertyCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "property_name")
    private String property_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Property> properties;
}
