package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "booking_id", nullable = false)
    private Long bookingId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "status")
    private String status;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "amount")
    private Double amount;

    // Constructors
    public Booking() {}

    public Booking(Long bookingId, String name, String email, String phone,
                   LocalDate bookingDate, String status, String serviceType, Double amount) {
        this.bookingId = bookingId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.bookingDate = bookingDate;
        this.status = status;
        this.serviceType = serviceType;
        this.amount = amount;
    }

    // Getters and Setters
    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getServiceType() { return serviceType; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
