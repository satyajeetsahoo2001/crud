package com.aadhaarData.entity;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Table(name = "father's_Data")
@Entity
public class FathersInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long aadhaarNumber;
@OneToOne(targetEntity = MothersInformation.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "mothers_id",referencedColumnName = "id")
  private MothersInformation mothersInformation;




}
