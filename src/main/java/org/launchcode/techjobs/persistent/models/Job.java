package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name="job")
public class Job extends AbstractEntity {

    @NotNull
    @ManyToOne
    private Employer employer;
    @NotNull
    @ManyToMany
    private List<Skill> skills;
    // Initialize the id and value fields.
    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }
    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public List<Skill> getSkills() {return skills;}
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Job() {}
}
