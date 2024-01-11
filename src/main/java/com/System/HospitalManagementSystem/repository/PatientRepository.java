package com.System.HospitalManagementSystem.repository;

import com.System.HospitalManagementSystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
