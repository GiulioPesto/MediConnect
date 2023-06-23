package com.example.TeamProject.entity;

import com.example.TeamProject.config.Auditable;
import com.example.TeamProject.enums.AccountActivationStateEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

import java.util.Set;

@Entity
@Table(name = "secretary")
public class SecretaryEntity extends Auditable<User> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "personal_telephone")
    private String personalTelephone;
    @Column(name = "office_telephone")
    private String officeTelephone;
    @JsonIgnore
    @Column(name = "activation")
    private AccountActivationStateEnum activation = AccountActivationStateEnum.ACTIVE;
    @OneToMany(mappedBy = "secretary", cascade = CascadeType.ALL)
    private Set<ContractEntity> contracts;
    @OneToMany(mappedBy = "secretary", cascade = CascadeType.ALL)
    private Set<BookingEntity> bookings;

    public SecretaryEntity(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String officeTelephone) {
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalTelephone = personalTelephone;
        this.officeTelephone = officeTelephone;
    }

    public SecretaryEntity() {}

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalTelephone() {
        return personalTelephone;
    }

    public void setPersonalTelephone(String personalTelephone) {
        this.personalTelephone = personalTelephone;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Set<ContractEntity> getContracts() { return contracts; }

    public void setContracts(Set<ContractEntity> contracts) { this.contracts = contracts; }

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    public Set<BookingEntity> getBookings() { return bookings; }

    public void setBookings(Set<BookingEntity> bookings) { this.bookings = bookings; }

    public AccountActivationStateEnum getActivation() { return activation; }

    public void setActivation(AccountActivationStateEnum activation) { this.activation = activation; }
}
