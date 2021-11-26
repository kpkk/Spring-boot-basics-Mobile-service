package com.example.mobile.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {

    @Id
    private String mobileName;
    private String brandName;
    private String sellerName;
    private int launchYear;
    private String operatingSystem;
    private Double price;
    private int soldCount;

}
