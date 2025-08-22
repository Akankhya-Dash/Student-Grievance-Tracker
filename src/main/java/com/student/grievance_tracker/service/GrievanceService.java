
package com.student.grievance_tracker.service;

import com.student.grievance_tracker.model.Grievance;
import com.student.grievance_tracker.repository.GrievanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrievanceService {

    private final GrievanceRepository grievanceRepository;

    public GrievanceService(GrievanceRepository grievanceRepository) {
        this.grievanceRepository = grievanceRepository;
    }

    public List<Grievance> getAllGrievances() {
        return grievanceRepository.findAll();
    }

    public Grievance createGrievance(Grievance grievance) {
        grievance.setStatus("Pending");
        return grievanceRepository.save(grievance);
    }

    public Grievance updateStatus(Long id, String status) {
        Grievance grievance = grievanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grievance not found"));
        grievance.setStatus(status);
        return grievanceRepository.save(grievance);
    }
}
