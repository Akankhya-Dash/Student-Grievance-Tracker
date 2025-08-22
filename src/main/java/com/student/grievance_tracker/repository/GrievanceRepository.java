package com.student.grievance_tracker.repository;
import com.student.grievance_tracker.model.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
}
