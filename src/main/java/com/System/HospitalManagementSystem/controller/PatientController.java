package com.System.HospitalManagementSystem.controller;

import com.System.HospitalManagementSystem.exception.InvalidResourceException;
import com.System.HospitalManagementSystem.exception.ResourceNotFoundException;
import com.System.HospitalManagementSystem.model.Patient;
import com.System.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        try {
            List<Patient> patients = patientService.getAllPatients();
            return new ResponseEntity<>(patients, HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "All Patients could not be found.");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Optional<Patient> patientOptional = patientService.getPatientById(id);
        if (patientOptional.isPresent()) {
            return new ResponseEntity<>(patientOptional.get(), HttpStatus.FOUND);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Patient with id : " + id + " does not exist.");
        }
    }

    @PostMapping
    public ResponseEntity<String> createPatient(@RequestBody Patient patient) {
        try {
            patientService.savePatient(patient);
            return new ResponseEntity<>("Patient is added.", HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Patient could not be added.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
        try {
            patientService.deletePatient(id);
            return new ResponseEntity<>("Patient with id : " + id + " is deleted.", HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        try {
            Patient patient = patientService.updatePatient(id, updatedPatient);
            return new ResponseEntity<>(patient, HttpStatus.OK);
        } catch (InvalidResourceException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}