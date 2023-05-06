package com.aadhaarData.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Candidate_Data")
@Entity
public class CandidateInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long aadhaarNumber;

    @ManyToOne(targetEntity = FathersInformation.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fathers_id",referencedColumnName = "id")
    private FathersInformation fathersInformation;
//    @ManyToOne(targetEntity = MothersInformation.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "mothers_id",referencedColumnName = "id")
//    private MothersInformation mothersInformation;

}
