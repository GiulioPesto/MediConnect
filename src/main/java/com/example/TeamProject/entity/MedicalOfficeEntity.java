package com.example.TeamProject.entity;

import com.example.TeamProject.enums.AccountActivationStateEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "medical_office")
public class MedicalOfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name =" address")
    private String address;
    @Column(name = "telephone")
    private String telephone;
    @JsonIgnore
    @Column(name = "activation")
    private AccountActivationStateEnum activation = AccountActivationStateEnum.ACTIVE;
    @OneToMany(mappedBy = "medicalOffice", cascade = CascadeType.ALL)
    private Set<ContractEntity> contracts;

    public MedicalOfficeEntity(String taxCode, String name, String city, String address, String telephone) {
        this.taxCode = taxCode;
        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
    }

    public MedicalOfficeEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<ContractEntity> getContracts() { return contracts; }

    public void setContracts(Set<ContractEntity> contracts) { this.contracts = contracts; }

    public AccountActivationStateEnum getActivation() { return activation; }

    public void setActivation(AccountActivationStateEnum activation) { this.activation = activation; }
}