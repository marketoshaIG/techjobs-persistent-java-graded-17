package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employer")
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(max=100)
    private String location;
    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {}
    public String getLocation() {return location;}
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Job> getJobs() {return jobs;}
    public void setJobs(List<Job> jobs) {this.jobs = jobs;}
    @Override
    public String toString() {
        return name + " - " + location;
    }
}
