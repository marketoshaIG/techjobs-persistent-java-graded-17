package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="skill")
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(max=500)
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getName() + ": " + description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
