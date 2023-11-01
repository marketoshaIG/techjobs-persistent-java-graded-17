package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="employer")
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(max=100)
    private String location;

    public Employer() {
    }

    public String getLocation() {return location;}

    public void setLocation(String location) {
        this.location = location;
    }
}
