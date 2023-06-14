package com.example.TeamProject.entity;
<<<<<<<< HEAD:src/main/java/com/example/TeamProject/entity/ContractEntity.java

import jakarta.persistence.*;
========
>>>>>>>> 70a22886414510687786d1c622082f075d5b9990:src/main/java/com/example/TeamProject/entity/Contract.java

import java.util.Date;

@Entity
@Table(name = "contract_entity")
public class ContractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private Double salary;
    /*@ManyToOne
    private MedicalOfficeEntity medicalOffice;
    @ManyToOne
    private DoctorEntity doctor;
    @ManyToOne
    private SecretaryEntity secretary;*/

    public ContractEntity() {}

    public ContractEntity(Date startDate, Date endDate, Double salary) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}