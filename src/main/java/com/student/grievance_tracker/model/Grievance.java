package com.student.grievance_tracker.model;
import jakarta.persistence.*;

@Entity
@Table(name = "grievances")
public class Grievance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String description;
    private String status; // e.g., Pending, Resolved

    // Constructors
    public Grievance() {}

    public Grievance(String studentName, String description, String status) {
        this.studentName = studentName;
        this.description = description;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}


