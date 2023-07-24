package com.annTraders.major.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    //is category k object ko directly hm frontend p use ni kr skte to dto ka use krna pdega (productDTO)...
    private Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;

}
