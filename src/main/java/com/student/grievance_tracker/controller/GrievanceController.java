package com.student.grievance_tracker.controller;

import com.student.grievance_tracker.model.Grievance;
import com.student.grievance_tracker.service.GrievanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grievances")
public class GrievanceController {

    private final GrievanceService grievanceService;

    public GrievanceController(GrievanceService grievanceService) {
        this.grievanceService = grievanceService;
    }

    @GetMapping
    public List<Grievance> getAllGrievances() {
        return grievanceService.getAllGrievances();
    }

    @PostMapping
    public Grievance createGrievance(@RequestBody Grievance grievance) {
        return grievanceService.createGrievance(grievance);
    }

    @PutMapping("/{id}")
    public Grievance updateStatus(@PathVariable Long id, @RequestParam String status) {
        return grievanceService.updateStatus(id, status);
    }
}
