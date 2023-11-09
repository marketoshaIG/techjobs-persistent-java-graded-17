package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="skill")
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(max=500)
    private String description;

    public Skill() {}

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public List<Job> getJobs() {return jobs;}

    public void setJobs(List<Job> jobs) {this.jobs = jobs;}

    @Override
    public String toString() {
        return getName() + ": " + description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
