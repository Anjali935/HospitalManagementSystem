# Hospital Management System API

This is a RESTful API for a Hospital Management System, developed using Spring Boot. It provides comprehensive CRUD operations for managing patients, doctors, and appointments. The API is integrated with Postman for easy testing.

## Features

- **Patient Module**: Manage patient information (Create, Read, Update, Delete).
- **Doctor Module**: Handle doctor details (Create, Read, Update, Delete).
- **Appointment Module**: Schedule and manage appointments.

### Prerequisites

- Java
- Maven
- MySQL
- Postman

## Getting Started

Follow these steps to get your development environment set up:

1. **Open the project** in your Java IDE or editor.
2. **Configure the `application.properties`** for the database.
3. **Run the application**.
4. **Testing with Postman**: Import the provided Postman collection to test the API endpoints.

## API Endpoints

### Patient Module

- `GET /patients` - List all patients.
- `GET /patients/{id}` - Get a patient.
- `POST /patients` - Add a patient.
- `PUT /patients/{id}` - Update a patient.
- `DELETE /patients/{id}` - Delete a patient.

### Doctor Module

- `GET /doctors` - List all doctors.
- `GET /doctors/{id}` - Get a doctor.
- `POST /doctors` - Add a doctor.
- `PUT /doctors/{id}` - Update a doctor.
- `DELETE /doctors/{id}` - Delete a doctor.

### Appointment Module

- `GET /appointments` - List all appointments.
- `GET /appointments/{id}` - Get an appointment.
- `POST /appointments` - Create an appointment.
- `PUT /appointments/{id}` - Update an appointment.
- `DELETE /appointments/{id}` - Delete an appointment.

## Technologies

- **Spring Boot**
- **MySQL**
- **Maven**
- **Postman**
