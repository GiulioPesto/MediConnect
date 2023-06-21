package com.example.TeamProject.entity;

import com.example.TeamProject.config.Auditable;
import jakarta.persistence.*;
import org.springframework.data.annotation.AccessType;
import org.springframework.security.core.userdetails.User;

import java.util.Set;

@Entity
@Table(name = "patient")
public class PatientEntity extends Auditable<User> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "telephone", nullable = false)
    private String telephone;
    @Column(name = "email", nullable = false)
    private String email;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<MedicalReportEntity> medicalReports;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<BookingEntity> bookings;

    public PatientEntity(String taxCode, String firstName, String lastName, String telephone, String email) {
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }

    public PatientEntity() {}

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<MedicalReportEntity> getMedicalReports() { return medicalReports; }

    public void setMedicalReports(Set<MedicalReportEntity> medicalReports) { this.medicalReports = medicalReports; }

    public Set<BookingEntity> getBookings() { return bookings; }

    public void setBookings(Set<BookingEntity> bookings) { this.bookings = bookings; }
}
