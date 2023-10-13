package com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class MaintenanceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String aptNumber;
    private String description;
    private Date createdAt;

    public MaintenanceRequest(Long id, String firstName, String lastName, String email, String aptNumber, String description) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.aptNumber = aptNumber;
        this.description = description;
    }


}
