package com.annTraders.major.dto;

import com.annTraders.major.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    //yahan category object ko ham usk id se use krenge..instead of(private Category category;)
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
