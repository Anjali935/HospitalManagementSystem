package com.System.HospitalManagementSystem.service;

import com.System.HospitalManagementSystem.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Optional<Appointment> getAppointmentById(Long id);
    Appointment saveAppointment(Appointment appointment);
    void deleteAppointment(Long id);
    Appointment updateAppointment(Long id, Appointment appointment);
}
