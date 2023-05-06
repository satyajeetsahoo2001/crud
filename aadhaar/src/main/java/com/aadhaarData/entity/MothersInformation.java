package com.aadhaarData.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Mother's_Data")
@Entity
public class MothersInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long aadhaarNumber;

}
